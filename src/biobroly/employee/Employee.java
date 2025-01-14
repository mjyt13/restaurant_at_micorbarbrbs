package employee;

import order.Order;

import java.lang.String;

public class Employee {

    protected String name;
    protected Role role;
    protected Order order;
    protected String experience;
    protected Employee nextEmployee;

    public Employee(String name, Role role, String experience) {
        this.name = name;
        this.role = role;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public void setNextEmployee(Employee employee) {
        nextEmployee = employee;
    }

    public void handleRequest(String request) {
        if (!role.work(request)) {
            System.out.println(name + " не может " + request + "\tПусть выполнит " + nextEmployee.getName());
            if (nextEmployee != null) nextEmployee.handleRequest(request);
            else System.out.println("HACPAHO");
        } else System.out.println(name + " дело сделал");
    }
}
