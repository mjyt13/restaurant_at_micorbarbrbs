package employee;

import client.Client;
import order.Observer;

public class Waiter extends Role implements Observer {
    private Client client;

    public void setClient(Client client){
        this.client = client;
    }
    @Override
    public boolean work(String request){
        return true;
    }

    @Override
    public void update(String status){
        if (status.equals("Создание заказа")){
            client.setOrderStatus(status);
        } else if (status.equals("готовится")) {
            client.setOrderStatus(status);
        }
    }
}
