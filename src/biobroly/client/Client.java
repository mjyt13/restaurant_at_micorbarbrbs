package client;

import employee.Employee;
import order.Observer;
import order.Order;

import java.util.List;

public class Client implements Observer {
    private String name;
    private List<String> contactInfo;
    private Order order;
    private String orderStatus;

    public Client(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createOrder(Order order){
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrderStatus(String status){
        this.orderStatus = status;
    }
    @Override
    public void update(String status) {

    }

    public void callWaiter(Employee employee){
        employee.getRole().setClient(this);
    }
}
