package reservation;

import reservation.table.CorporativeTable;
import reservation.table.Table;

import java.util.Date;

public class CorporativeReservation extends Reservation{
    @Override
    public Table makeReservation(int peopleNumber) {
        CorporativeTable corporativeTable = new CorporativeTable();
        time = new Date();
        this.peopleNumber = peopleNumber;
        type = "Банкетное";
        return corporativeTable;
    }
}
