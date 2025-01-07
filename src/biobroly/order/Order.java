package order;

import dish.Dish;
import payment.PaymentSystem;
import payment.method.PaymentMethod;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date creationTime;
    private List<Dish> dishes;
    private double sum;
    private String status;
    private List<Observer> subscribers;
    private PaymentSystem payment;

    public Order(){
        dishes = new ArrayList<>();
        creationTime = new Date();
        status = "Создание заказа";
        subscribers = new ArrayList<>();
        sum = 0;
    }

    public void addDish(Dish dish){
        dishes.add(dish);
        sum += dish.getCost();
    }

    public void removeDish(Dish dish){
        dishes.remove(dish);
        sum -= dish.getCost();
    }
    public Date getCreationTime(){return creationTime;}

    public double getSum(){return sum;}

//    also known as updateStatus
    public void setStatus(String status){
        this.status = status;
        notifyObserver();
    }

    public String getStatus(){return status;}

    public void setPayment(PaymentMethod paymentMethod){
        this.payment = new PaymentSystem(paymentMethod,sum);
    }

    public void notifyObserver(){
        for(Observer subscriber: subscribers){
            subscriber.update(status);
        }
    }

    public void subscribe(Observer observer){
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer){
        subscribers.remove(observer);
    }

}
