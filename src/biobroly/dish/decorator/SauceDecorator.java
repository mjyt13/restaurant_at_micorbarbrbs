package dish.decorator;

import dish.Dish;

public class SauceDecorator extends DishDecorator {
    private double amount;

    public SauceDecorator(Dish decoratedDish, double amount){
        super(decoratedDish);
        this.amount = amount;
    }

    @Override
    public double getCost(){
        return decoratedDish.getCost() + amount;
    }

    @Override
    public String getName(){
        return decoratedDish.getName() + " и соус";
    }

    @Override
    public String getType(){
        return decoratedDish.getType() + " с соусом";
    }
}
