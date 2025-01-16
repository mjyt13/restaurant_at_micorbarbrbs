package employee;

import menu.Menu;
import order.Observer;

public class Waiter extends Role implements Observer {
    private void showMenu(){
        Menu.getInstance().showMenu();
    }
    private void sayReady(){
        System.out.println("Заказ клиента "+client.getName()+" готов");
    }
    @Override
    public boolean work(String request){
        switch (request){
            case "start_service":
                return true;
            case "show_menu":
                showMenu();
                return true;
            case "say_ready":
                sayReady();
                return true;
            default:
                return false;
        }
    }

    @Override
    public void update(String status){
        if (status.equals("Создание заказа")){
            client.setOrderStatus(status);
        } else if (status.equals("Готов")) {
            System.out.println("Заказ клиента "+client.getName()+" готов");
        }else if (status.equals("Неполный")) {
            System.out.println("Заказ клиента "+client.getName()+" готов в максимально возможной мере");
        }
    }
}
