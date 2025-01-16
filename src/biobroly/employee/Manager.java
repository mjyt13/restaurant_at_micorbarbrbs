package employee;

import inventory.Inventory;
import inventory.Stash;

public class Manager extends Role{

    private void replenish(){
        for(Inventory inventory: Stash.getInstance().getStash()){
            inventory.checkAndReplenish();
        }
    }

    private void makeReport(){
        saleReport.makeReport();
    }

    @Override
    public boolean work(String request){
        switch (request){
            case "replenish":
                replenish();
                return true;
            case "make_report":
                makeReport();
            default:
                return false;
        }
    }
}
