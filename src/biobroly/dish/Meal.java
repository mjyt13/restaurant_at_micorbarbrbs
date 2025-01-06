package dish;

import java.util.List;

public class Meal extends Dish {
    public Meal(String name, double cost, List<List<String>> recipe){
        super(name,"Блюдо",cost,recipe);
    }
}
