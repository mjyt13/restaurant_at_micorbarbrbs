package employee;

public class Waiter extends Role{
    private String client;

    @Override
    public boolean work(String request){
        return true;
    }
}
