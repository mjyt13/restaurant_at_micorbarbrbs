package inventory.supplier;

import inventory.Inventory;

public class RegularSupply implements Supplier{
    @Override
    public void replenishReserves(Inventory inventory) {
        String name = inventory.getProductName();
        int quantity = inventory.getQuantity();

        switch (name){
            case "cucumber":
                inventory.setQuantity(quantity+100);
                break;
            case "potato":
                inventory.setQuantity(quantity+150);
                break;
            default:
                inventory.setQuantity(0);
                break;
        }
    }
}
