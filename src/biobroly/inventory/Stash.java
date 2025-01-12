package inventory;

import java.util.ArrayList;

public class Stash {
    private static Stash instance;
    private ArrayList<Inventory> stash;

    private Stash(){
        stash = new ArrayList<Inventory>();
    }

    public static Stash getInstance() {
        if(instance == null){
            instance = new Stash();
        }
        return instance;
    }
    /*public Stash(){
        stash = new ArrayList<Inventory>();
    }*/
    public ArrayList<Inventory> getStash() {
        return stash;
    }
    public void addInventory(Inventory inventory){
        stash.add(inventory);
    }
    public void viewStash(){
        if (stash == null){
            System.out.println("Пусто на складе");
        }
        else{
            for (Inventory inventory: stash){
                System.out.println(inventory.getProductName()+" - "+inventory.getQuantity()+" шт.");
            }
        }
    }
}
