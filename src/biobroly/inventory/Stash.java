package inventory;

import java.util.ArrayList;

public class Stash {
    public static ArrayList<Inventory> stash = new ArrayList<>();
    public static void viewStash(){
        for (Inventory inventory: stash){
            System.out.println(inventory.getProductName()+" - "+inventory.getQuantity()+" шт.");
        }
    }
}
