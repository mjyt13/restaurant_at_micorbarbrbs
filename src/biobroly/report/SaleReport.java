package report;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleReport extends Report{
    List<OrderReport> reports;
    public SaleReport(Date startDate){
        super(startDate, new Date(), "Отчёт по продажам");
        reports = new ArrayList<OrderReport>();
    }

    public void addReport(OrderReport report) {
        reports.add(report);
    }

    @Override
    public void makeReport() {
        double totalSum = 0;
        for(OrderReport report: reports){
            totalSum += report.getSum();
        }
        System.out.println("За время "+startDate+" - "+endDate+" было продано на "+totalSum+" денег");
    }
    //    возможно, надо реально реализовать историю заказов за "день"

}
