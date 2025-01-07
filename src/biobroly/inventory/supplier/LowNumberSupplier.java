package inventory.supplier;

import inventory.Inventory;

public class LowNumberSupplier implements Supplier{
    @Override
    public void replenishReserves(Inventory inventory) {
        String name = inventory.getProductName();
        int quantity = inventory.getQuantity();

        switch (name){
            case "cucumber":
                inventory.setQuantity(quantity+350);
                break;
            case "potato":
                inventory.setQuantity(quantity+450);
                break;
            case "salmon":
                inventory.setQuantity(quantity+100);
                break;
            case "beef":
                inventory.setQuantity(quantity+65);
                break;
            case "carrot":
                inventory.setQuantity(quantity+450);
                break;
            case "shrimps":
                inventory.setQuantity(quantity+900);
                break;
            case "herring":
                inventory.setQuantity(quantity+200);
                break;
            default:
                inventory.setQuantity(0);
                break;
        }
    }
}
