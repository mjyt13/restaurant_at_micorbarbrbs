package client;

import order.Order;

import java.util.List;

public class Client {
    private String name;
    private List<String> contactInfo;
    private Order order;
    private String orderStatus;

    public void createOrder(Order order){
        this.order = order;
    }

    public void setOrderStatus(String status){
        this.orderStatus = status;
    }
}
