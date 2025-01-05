package employee;

import inventory.Inventory;
import java.util.ArrayList;

public class Manager extends Role{
    public static ArrayList<Inventory> Stash = new ArrayList<>();

    private void replenish(){
        for(Inventory inventory: Stash){
            inventory.checkAndReplenish();
        }
    }

    @Override
    public boolean work(String request){
        switch (request){
            case "replenish":
                replenish();
                return true;
            default:
                return false;
        }
    }
}
