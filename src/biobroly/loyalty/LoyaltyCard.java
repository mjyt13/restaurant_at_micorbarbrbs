package loyalty;

import client.Client;

public class LoyaltyCard extends LoyaltyComponent{
    public LoyaltyCard(Client client){
        super(client);
    }

    @Override
    public void accurePoints(int points) {
        pointBalance += points;
        System.out.println("Начислено "+points+" баллов. Баланс: "+pointBalance+" баллов.");
    }

    @Override
    public void cancelPoints(int points) {
        if(pointBalance < points){
            System.out.println("Списать "+points+" баллов невозможно. Доступно "+pointBalance+" баллов.");
        }else {
            pointBalance -= points;
            System.out.println("Списанону "+points+" баллов. Баланс: "+pointBalance+" баллов.");
        }
    }
}
