import dish.Dish;

import java.util.ArrayList;

public class Menu {
    private static Menu instance;
    private ArrayList<Dish> menu;

    private Menu(){
        menu = new ArrayList<Dish>();
    }
    public static Menu getInstance() {
        if(instance == null){
            instance = new Menu();
        }
        return instance;
    }

    public void addDish(Dish dish){
        menu.add(dish);
    }
    public void removeDish(Dish dish){
        menu.remove(dish);
    }

    public ArrayList<Dish> getMenu(){
        return menu;
    }

    public void showMenu(){
        System.out.println("Сегодняшнее меню:");
        int num = 1;
        for (Dish dish: menu){
            System.out.println(num+". "+dish.getName()+", "+dish.getCost()+" денег");
            num++;
        }
        System.out.println();
    }
}
