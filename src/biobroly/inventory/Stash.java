package inventory;

import java.util.ArrayList;

public class Stash {
    private ArrayList<Inventory> stash;

    public Stash(){
        stash = new ArrayList<Inventory>();
    }
    public  ArrayList<Inventory> getStash() {
        return stash;
    }

    public void addInventory(Inventory inventory){
        stash.add(inventory);
    }
    public  void viewStash(){
        for (Inventory inventory: stash){
            System.out.println(inventory.getProductName()+" - "+inventory.getQuantity()+" шт.");
        }
    }
}
