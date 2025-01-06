package payment.method;

public class Cash implements PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Оплата наличными в размере "+amount+" денег происходит");
    }
    @Override
    public void refund(double amount){
        System.out.println("Возврат наличными в размере "+amount+" денег происходит");
    }
}
