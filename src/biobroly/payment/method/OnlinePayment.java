package payment.method;

public class OnlinePayment implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Оплата онлайн в размере "+amount+" денег происходит");
    }
    @Override
    public void refund(double amount){
        System.out.println("Возврат суммы онлайн платежа в размере "+amount+" денег происходит");
    }
}
