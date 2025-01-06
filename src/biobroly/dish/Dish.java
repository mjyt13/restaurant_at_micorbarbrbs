package dish;

import java.util.ArrayList;
import java.util.List;

public abstract class Dish {
    private String name;
    private String type;
    private double cost;
    private List<List<String>> recipe = new ArrayList<List<String>>();

    public Dish(String name, String type, double cost, List<List<String>> recipe){
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.recipe = recipe;
    }

    public List<List<String>> getRecipe(){return recipe;}
    public double getCost(){return cost;}
    public void setCost(double cost){this.cost = cost;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getType(){return type;}
    public void setType(String type){this.type = type;}

}
