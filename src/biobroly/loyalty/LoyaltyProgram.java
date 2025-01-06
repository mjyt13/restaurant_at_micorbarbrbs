package loyalty;

import client.Client;

import java.util.ArrayList;
import java.util.List;

public class LoyaltyProgram extends LoyaltyComponent {

    private List<LoyaltyComponent> clients;

    public LoyaltyProgram(Client client) {
        super(client);
        clients = new ArrayList<LoyaltyComponent>();
    }

    public void add(LoyaltyComponent client) {
        clients.add(client);
    }

    public void remove(LoyaltyComponent client) {
        clients.remove(client);
    }

    public List<LoyaltyComponent> getClients() {
        return clients;
    }
}
