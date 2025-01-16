package employee;

import dish.Dish;
import dish.DishBook;
import inventory.Inventory;
import inventory.Stash;
import menu.Menu;

import java.util.List;

public class Chef extends Role{

    private void cook(){
        List<Inventory> resources = Stash.getInstance().getStash();
        String status = "Пустой";
        int cooked = 0;
        for (Dish dish: getClient().getOrder().getDishes()){
            if (checkResourcesForDish(dish,resources)) {
                consumeResourcesForDish(dish,resources);
                System.out.println(dish.getName()+" готово");
                cooked++;
                client.getOrder().setStatus("В процессе готовки");
            }else {
                System.out.println(dish.getName()+" приготовить невозможно");
                client.getOrder().setStatus("Неполный");
                status = "неполный";
            }
        }
        if(cooked == 0){
            client.getOrder().setStatus("Пустой");
        }
        if (status != "неполный"){
            client.getOrder().setStatus("Готов");
        }else {
            client.getOrder().setStatus("Неполный");
        }

    }

    private void declareMenu(){
        DishBook.createDishList();
        List<Dish> dishes = DishBook.getDishList();
        List<Inventory> resources = Stash.getInstance().getStash();
        System.out.println("zdarova zhopi, u menya v knige blud "+dishes.size());
        /*
        for (Inventory inventory: resources){
            System.out.println(inventory.getProductName()+" - "+inventory.getQuantity());
        }*/
        for(Dish dish: dishes){
            if (checkResourcesForDish(dish,resources)) {
                System.out.println(dish.getName()+" сегодня будет в меню");
                Menu.getInstance().addDish(dish);
            }else {
                System.out.println(dish.getName()+" сегодня не появится в меню");
            }
        }
        dishes.clear();
    }

    private boolean checkResourcesForDish(Dish dish, List<Inventory> resources){
//        новая проверка - пустота склада (его отсутствие). если так, то, разумеется, никакое меню не получится
        if(resources.size() == 0){
            return false;
        }

//        нужно получить рецепт блюда и посмотреть, сколько там продуктов
        List<List<String>> recipe = dish.getRecipe();
        int number_products = recipe.size();
//        после чего пройтись по количеству найденных продуктов на складе, количество которых удовлетворяет требованиям
//        здесь это обозначено в виде matched_enough_products, которая увеличивается до тех пор, пока не будет равна
//        количеству продуктов в рецепте
        for(int matched_enough_products = 0; matched_enough_products < number_products; matched_enough_products++){
            String product_name = recipe.get(matched_enough_products).get(0);
            int product_quantity = Integer.parseInt(recipe.get(matched_enough_products).get(1));
//            сам проход по складу
            boolean inventory_found = false;
            for(Inventory inventory: resources){
                if (inventory.getProductName() == product_name){
                    inventory_found = true;
//                    System.out.println("на складе "+inventory.getQuantity()+", а надо "+product_quantity);
                    if (inventory.getQuantity() < product_quantity){
//                    не хватило продукта хотя бы одного - блюдо нельзя приготовить, тогда его сразу можно вычеркивать
                        return false;
                    }
                }
            }
            if(!inventory_found) return false;
        }
//        хватило всех продуктов - блюдо можно готовить, добавить в меню надо
        return true;
    }
    private void consumeResourcesForDish(Dish dish, List<Inventory> resources){
//        в этом методе не нужны проверки - они были осуществлены ранее
        List<List<String>> recipe = dish.getRecipe();
        for (List<String> recipe_piece: recipe){
            String product_name = recipe_piece.get(0);
            int product_quantity = Integer.parseInt(recipe_piece.get(1));
            for(Inventory inventory: resources){
                if (inventory.getProductName() == product_name){
                    inventory.setQuantity(inventory.getQuantity()-product_quantity);
                }
            }
        }
    }
    @Override
    public boolean work(String request){
        switch (request){
            case "declare_menu":
                declareMenu();
                return true;
            case "cook":
                cook();
                return true;
            default:
                return false;
        }
    }
}
