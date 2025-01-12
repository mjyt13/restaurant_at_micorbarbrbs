package employee;

import dish.Dish;
import dish.DishBook;
import inventory.Inventory;
import inventory.Stash;
import menu.Menu;

import java.util.List;

public class Chef extends Role{

    private void cook(){

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
