package dish;

import java.util.ArrayList;
import java.util.List;

public class DishBook {
    private static List<Dish> dishList =new ArrayList<Dish>();
    public static void createDishList (){
        List<List<String>> recipe = new ArrayList<>();
        List<String> recipe_piece = new ArrayList<>();

        recipe_piece.add("potato"); recipe_piece.add("5");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("cucumber"); recipe_piece.add("1");
        recipe.add(new ArrayList<>(recipe_piece));
        Meal dish = new Meal("Пюре",120,new ArrayList<>(recipe));
        dishList.add(dish);

        dish = null;
        recipe.clear();
        recipe_piece.clear();

        recipe_piece.add("potato"); recipe_piece.add("12");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("cucumber"); recipe_piece.add("19");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        dish = new Meal("Жыжа",20,new ArrayList<>(recipe));
        dishList.add(dish);

        dish = null;
        recipe.clear();

        recipe_piece.add("salmon"); recipe_piece.add("2");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("cucumber"); recipe_piece.add("3");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("onion"); recipe_piece.add("2");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("lemon"); recipe_piece.add("1");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("pepper"); recipe_piece.add("2");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        dish = new Meal("Севиче",90,new ArrayList<>(recipe));
        dishList.add(dish);

        dish = null;
        recipe.clear();

        recipe_piece.add("salmon"); recipe_piece.add("5");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("eggplant"); recipe_piece.add("1");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("squash"); recipe_piece.add("1");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("mushroom"); recipe_piece.add("8");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("onion"); recipe_piece.add("2");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("garlic"); recipe_piece.add("1");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        recipe_piece.add("tomato_cherry"); recipe_piece.add("8");
        recipe.add(new ArrayList<>(recipe_piece));
        recipe_piece.clear();
        dish = new Meal("Стейк из лосося с овощами",150,new ArrayList<>(recipe));
        dishList.add(dish);

        dish = null;
        recipe.clear();

    }

    public static List<Dish> getDishList(){
        return dishList;
    }
}
