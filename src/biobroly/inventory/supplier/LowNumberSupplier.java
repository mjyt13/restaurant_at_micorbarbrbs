package inventory.supplier;

import inventory.Inventory;

public class LowNumberSupplier implements Supplier{
    @Override
    public void replenishReserves(Inventory inventory) {
        String name = inventory.getProductName();
        int quantity = inventory.getQuantity();

        switch (name){
            case "cucumber":
                inventory.setQuantity(quantity+600);
                break;
            case "potato":
                inventory.setQuantity(quantity+450);
                break;
            default:
                inventory.setQuantity(0);
                break;
        }
    }
}
