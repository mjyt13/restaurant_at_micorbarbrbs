package payment;

import payment.method.PaymentMethod;

public class PaymentSystem {
    private PaymentMethod paymentMethod;
    private double amount;

    public PaymentSystem(PaymentMethod paymentMethod, double amount){
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public PaymentMethod getPaymentMethod(){return paymentMethod;}
    public double getAmount(){return amount;}

    public void makePayment(double amount){
        paymentMethod.pay(amount);
    }
    public void makeRefund(double amount){
        paymentMethod.refund(amount);
    }

}
