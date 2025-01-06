package reservation;

import reservation.table.Table;

import java.util.Date;

public abstract class Reservation {
    protected Date time;
    protected int peopleNumber;
    protected String type;

    public abstract Table makeReservation(int peopleNumber);
}
