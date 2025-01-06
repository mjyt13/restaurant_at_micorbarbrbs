package payment.method;

public class Card implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Оплата картой в размере "+amount+" денег происходит");
    }
    @Override
    public void refund(double amount){
        System.out.println("Возврат на карту в размере "+amount+" денег происходит");
    }
}
