package reservation;

import reservation.table.PeopleTable;
import reservation.table.Table;

import java.util.Date;

public class PeopleReservation extends Reservation{
    @Override
    public Table makeReservation(int peopleNumber) {
        PeopleTable peopleTable = new PeopleTable();
        time = new Date();
        this.peopleNumber = peopleNumber;
        type = "Людское";
        return peopleTable;
    }
}
