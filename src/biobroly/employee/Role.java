package employee;

import client.Client;
import report.SaleReport;

public abstract class Role {
    protected Client client;
    protected SaleReport saleReport;
    public void setClient(Client client){
        this.client = client;
    }
    public Client getClient(){
        return client;
    }

    public void setSaleReport(SaleReport saleReport) {
        this.saleReport = saleReport;
    }

    public SaleReport getSaleReport() {
        return saleReport;
    }

    public abstract boolean work(String request);

}
