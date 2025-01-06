package loyalty;

import client.Client;

public class LoyaltyComponent {
    protected Client client;
    protected int pointBalance;

    public LoyaltyComponent(Client client) {
        this.client = client;
        this.pointBalance = 0;
    }

    public void accurePoints(int points) {
        pointBalance += points;
    }

    public void cancelPoints(int points) {
        pointBalance -= points;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
