package dish;

import java.util.List;

public class Drink extends Dish{
    public Drink(String name, double cost, List<List<String>> recipe){
        super(name,"Напиток",cost,recipe);
    }
}
