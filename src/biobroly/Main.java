import dish.Dish;
import dish.Meal;
import employee.Chef;
import employee.Employee;
import employee.Manager;
import employee.Waiter;
import inventory.Inventory;
import inventory.Stash;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//       сначала создаются объекты, которые будут изменяться меньше всего
        Menu menu = Menu.getInstance();
        Stash mainStash = new Stash();

        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        Manager manager = new Manager(mainStash);

//        создание рецптов и блюд
        List<List<String>> recipe = new ArrayList<>();
        List<String> recipe_piece = new ArrayList<>();
        recipe_piece.add("potato"); recipe_piece.add("5");

        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("cucumber"); recipe_piece.add("1");
        recipe.add(new ArrayList<>(recipe_piece));
        Meal dish = new Meal("Пюре",120,new ArrayList<>(recipe));
        menu.addDish(dish);

        dish = null;
        recipe.clear();
        recipe_piece.clear();
        recipe_piece.add("potato"); recipe_piece.add("12");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("cucumber"); recipe_piece.add("19");
        recipe.add(new ArrayList<>(recipe_piece));
        dish = new Meal("Жыжа",20,new ArrayList<>(recipe));
        menu.addDish(dish);


//        Привлечь сотрудников к работе
        Employee Manacle = new Employee("Bray",manager,"ZERO");
        Employee Fraud = new Employee("Fraud",chef,"METEOR");
        Employee Satana = new Employee("Satana",waiter,"NEO");

        menu.showMenu();

        List<Dish> shiski = menu.getMenu();
        for (Dish dish2: shiski){
            System.out.println(dish2.getRecipe());
        }
//        пока не получается в классе Stash добавить продуктов, так что будет их объявление происходить здесь
//        upd: Stash теперь нестатичный класс, всё по классике
        mainStash.viewStash();
        Inventory cucumber = new Inventory("cucumber",100,35);
        Inventory potato = new Inventory("potato",120,45);
        Inventory salmon = new Inventory("salmon",40,10);
        Inventory beef = new Inventory("beef",25,6);
        Inventory carrot = new Inventory("carrot",100,45);
        Inventory shrimps = new Inventory("shrimps",300,90);
        Inventory herring = new Inventory("herring",80,20);
        mainStash.addInventory(cucumber);
        mainStash.addInventory(potato);
        mainStash.addInventory(salmon);
        mainStash.addInventory(beef);
        mainStash.addInventory(carrot);
        mainStash.addInventory(shrimps);
        mainStash.addInventory(herring);

        mainStash.viewStash();
        Manacle.handleRequest("replenish");
        mainStash.viewStash();
    }
}
