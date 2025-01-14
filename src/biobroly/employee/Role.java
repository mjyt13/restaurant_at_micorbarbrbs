package employee;

import client.Client;

public abstract class Role {
    protected Client client;

    public void setClient(Client client){
        this.client = client;
    }
    public Client getClient(){
        return client;
    }
    public abstract boolean work(String request);

}
