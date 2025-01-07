package report;

import employee.Employee;
import order.Order;

import java.util.Date;

public class OrderReport extends Report{
    private double sum;
    private String employeeName;
    public OrderReport(Order order, Employee employee){
        super(order.getCreationTime(),new Date(),"Отчёт по заказу");
        this.sum = order.getSum();
        this.employeeName = employee.getName();
    }

    public double getSum() {
        return sum;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    @Override
    public void makeReport() {
        System.out.println("Заказ от "+startDate+" обслужен официантом "+employeeName);
    }
}
