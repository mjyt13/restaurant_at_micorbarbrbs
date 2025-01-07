package loyalty;

import java.util.ArrayList;
import java.util.List;

public class LoyaltyProgram extends LoyaltyComponent {

    private List<LoyaltyComponent> components;

    public LoyaltyProgram() {
        components = new ArrayList<LoyaltyComponent>();
    }

    public void add(LoyaltyComponent component) {
        components.add(component);
    }

    public void remove(LoyaltyComponent component) {
        components.remove(component);
    }

    public List<LoyaltyComponent> getComponents() {
        return components;
    }

    public LoyaltyComponent getChild(int index){
        return components.get(index);
    }
    @Override
    public void accurePoints(int points) {
        if(components.size() > 0){
            System.out.println("зачислить "+points+" на все карты");
            for (LoyaltyComponent component: components){
                component.accurePoints(points);
            }
        }else{
            System.out.println("Карт нет");
        }
    }

    @Override
    public void cancelPoints(int points) {
        if(components.size() > 0){
            System.out.println("снять "+points+" со всех карт");
            for (LoyaltyComponent component: components){
                component.cancelPoints(points);
            }
        }else{
            System.out.println("Карт нет");
        }

    }
}
