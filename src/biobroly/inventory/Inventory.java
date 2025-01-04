package inventory;

import inventory.supplier.LowNumberSupply;
import inventory.supplier.RegularSupply;
import inventory.supplier.Supplier;
public class Inventory{
    private String productName;
    private int quantity;
    private int lowQuantity;
    private Supplier supplier;

    public Inventory(String productName, int quantity, int lowQuantity){
        this.productName = productName;
        this.quantity = quantity;
        this.lowQuantity = lowQuantity;
    }

    public String getProductName(){return productName;}
    public void setQuantity(int quantity){this.quantity = quantity;}
    public int getQuantity(){return quantity;}


    public void checkAndReplenish(){
        if (quantity <= lowQuantity) supplier = new LowNumberSupply();
        else supplier = new RegularSupply();
        supplier.replenishReserves(this);
    }
}
