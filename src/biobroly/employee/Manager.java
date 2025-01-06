package employee;

import inventory.Inventory;
import inventory.Stash;

import java.util.List;

public class Manager extends Role{
    public List<Inventory> stash = Stash.stash;

    private void replenish(){
        for(Inventory inventory: stash){
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
