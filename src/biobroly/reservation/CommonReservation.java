package reservation;

import reservation.table.CommonTable;

import java.util.Date;

public class CommonReservation extends Reservation{
    @Override
    public CommonTable makeReservation(int peopleNumber) {
         CommonTable commonTable = new CommonTable();
         time = new Date();
         this.peopleNumber = peopleNumber;
         type = "Обычное";
         return commonTable;
    }
}
