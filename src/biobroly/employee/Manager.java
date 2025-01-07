package employee;

import inventory.Inventory;
import inventory.Stash;

public class Manager extends Role{

    private Stash stash;

    public Manager(Stash stash){
        this.stash = stash;
    }
    private void replenish(){
        for(Inventory inventory: stash.getStash()){
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
