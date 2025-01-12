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
            case "pepper":
                inventory.setQuantity(quantity+60);
                break;
            case "onion":
                inventory.setQuantity(quantity+90);
                break;
            case "lemon":
                inventory.setQuantity(quantity+15);
                break;
            case "eggplant":
                inventory.setQuantity(quantity+40);
                break;
            case "squash":
                inventory.setQuantity(quantity+25);
                break;
            case "mushroom":
                inventory.setQuantity(quantity+120);
                break;
            case "garlic":
                inventory.setQuantity(quantity+15);
                break;
            case "tomato_cherry":
                inventory.setQuantity(quantity+80);
                break;
            default:
                inventory.setQuantity(0);
                break;
        }
    }
}
