package dish.decorator;

import dish.Dish;

public class DishDecorator extends Dish{
    protected Dish decoratedDish;

    public DishDecorator(Dish decoratedDish){
        super(decoratedDish.getName(),decoratedDish.getType(),decoratedDish.getCost(),decoratedDish.getRecipe());
        this.decoratedDish = decoratedDish;
    }
}
