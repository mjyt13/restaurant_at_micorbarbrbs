package payment.method;

public interface PaymentMethod {
    public void pay(double amount);
    public void refund(double amount);
}
