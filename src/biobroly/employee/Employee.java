package employee;
import java.lang.String;

public class Employee {

    protected String name;
    protected Role role;
    protected String experience;
    protected Employee nextEmployee;

    public Employee(String name, Role role, String experience){
        this.name = name;
        this.role = role;
        this.experience = experience;
    }

    public void setNextEmployee(Employee employee){
        nextEmployee = employee;
    }

    public void handleRequest(String request){
        if (!role.work(request)){
            if (nextEmployee != null) nextEmployee.handleRequest(request);
            else System.out.println("HACPAHO");
        }
    }
}
