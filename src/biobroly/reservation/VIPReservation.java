package reservation;

import reservation.table.Table;
import reservation.table.VIPTable;

import java.util.Date;

public class VIPReservation extends Reservation {
    @Override
    public Table makeReservation(int peopleNumber) {
        VIPTable vipTable = new VIPTable();
        time = new Date();
        this.peopleNumber = peopleNumber;
        type = "ВИПИ";
        return vipTable;
    }
}
