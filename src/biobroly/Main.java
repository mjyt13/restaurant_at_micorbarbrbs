import employee.Chef;
import employee.Employee;
import employee.Manager;
import employee.Waiter;
import inventory.Inventory;
import inventory.Stash;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        Manager manager = new Manager();
        Employee Manacle = new Employee("Bray",manager,"ZERO");
        Employee Fraud = new Employee("Fraud",chef,"METEOR");
        Employee Satana = new Employee("Satana",waiter,"NEO");

        Inventory cucumber = new Inventory("cucumber",100,30);
        Stash.stash.add(cucumber);
        Inventory potato = new Inventory("potato",100,30);
        Stash.stash.add(potato);
        Stash.viewStash();

        Manacle.handleRequest("replenish");
        Stash.viewStash();
    }
}
