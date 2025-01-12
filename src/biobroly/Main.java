import dish.Dish;
import employee.Chef;
import employee.Employee;
import employee.Manager;
import employee.Waiter;
import inventory.Inventory;
import inventory.Stash;
import menu.Menu;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//       сначала создаются объекты, которые будут изменяться меньше всего

        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        Manager manager = new Manager();

//        создание рецптов и блюд(upd 11.01: перенесено в отдельный класс DishBook)

//        Привлечь сотрудников к работе
        Employee Manacle = new Employee("Manacle",manager,"ZERO");
        Employee Fraud = new Employee("Fraud",chef,"METEOR");
        Employee Satana = new Employee("Satana",waiter,"NEO");

        Manacle.setNextEmployee(Fraud);
        Fraud.setNextEmployee(Satana);

        Manacle.handleRequest("declare_menu");

        Menu.getInstance().showMenu();

        List<Dish> shiski = Menu.getInstance().getMenu();
        for (Dish dish2: shiski){
            System.out.println(dish2.getRecipe());
        }
//        пока не получается в классе Stash добавить продуктов, так что будет их объявление происходить здесь
//        upd: Stash теперь нестатичный класс, всё по классике
        Stash.getInstance().viewStash();
        Inventory cucumber = new Inventory("cucumber",100,35);
        Inventory potato = new Inventory("potato",120,45);
        Inventory salmon = new Inventory("salmon",40,10);
        Inventory beef = new Inventory("beef",25,6);
        Inventory carrot = new Inventory("carrot",100,45);
        Inventory shrimps = new Inventory("shrimps",300,90);
        Inventory herring = new Inventory("herring",80,20);
        Inventory pepper = new Inventory("pepper",70,15);
        Inventory onion = new Inventory("onion",120,40);
        Inventory lemon = new Inventory("lemon",20,3);
        Inventory eggplant = new Inventory("eggplant",50,10);
        Inventory squash = new Inventory("squash",30,7); //кабачок
        Inventory mushroom = new Inventory("mushroom",150,30);
        Inventory garlic = new Inventory("garlic",20,3);
        Inventory tomato_cherry = new Inventory("tomato_cherry",100,20);
        Stash.getInstance().addInventory(cucumber);
        Stash.getInstance().addInventory(potato);
        Stash.getInstance().addInventory(salmon);
        Stash.getInstance().addInventory(beef);
        Stash.getInstance().addInventory(carrot);
        Stash.getInstance().addInventory(shrimps);
        Stash.getInstance().addInventory(herring);
        Stash.getInstance().addInventory(pepper);
        Stash.getInstance().addInventory(onion);
        Stash.getInstance().addInventory(lemon);
        Stash.getInstance().addInventory(eggplant);
        /*Stash.getInstance().addInventory(squash);
        Stash.getInstance().addInventory(mushroom);
        Stash.getInstance().addInventory(eggplant);
        Stash.getInstance().addInventory(garlic);
        Stash.getInstance().addInventory(tomato_cherry);*/

//        Stash.getInstance().viewStash();
//        System.out.println();
//        Manacle.handleRequest("replenish");
//        System.out.println();
//        Stash.getInstance().viewStash();

        Manacle.handleRequest("declare_menu");
        Menu.getInstance().showMenu();
    }
}
