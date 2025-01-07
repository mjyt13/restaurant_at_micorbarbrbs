package inventory.supplier;

import inventory.Inventory;

public class RegularSupplier implements Supplier{
    @Override
    public void replenishReserves(Inventory inventory) {
        String name = inventory.getProductName();
        int quantity = inventory.getQuantity();

        switch (name){
            case "cucumber":
                inventory.setQuantity(quantity+100);
                break;
            case "potato":
                inventory.setQuantity(quantity+120);
                break;
            case "salmon":
                inventory.setQuantity(quantity+40);
                break;
            case "beef":
                inventory.setQuantity(quantity+25);
                break;
            case "carrot":
                inventory.setQuantity(quantity+100);
                break;
            case "shrimps":
                inventory.setQuantity(quantity+300);
                break;
            case "herring":
                inventory.setQuantity(quantity+80);
                break;
            default:
                inventory.setQuantity(0);
                break;
        }
    }
}
