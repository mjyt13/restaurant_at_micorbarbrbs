package dish.decorator;

import dish.Dish;

public class GarnishDecorator extends DishDecorator {
    private double amount;

    public GarnishDecorator(Dish decoratedDish,double amount){
        super(decoratedDish);
        this.amount = amount;
    }

    @Override
    public double getCost(){
        return decoratedDish.getCost() + amount;
    }

    @Override
    public String getName(){
        return decoratedDish.getName() + " и гарнир";
    }

    @Override
    public String getType(){
        return decoratedDish.getType() + " с гарниром";
    }

}
