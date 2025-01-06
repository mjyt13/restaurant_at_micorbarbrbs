package report;

import java.util.Date;

public abstract class Report {
    protected Date startDate;
    protected Date endDate;
    protected String reportType;

    public Date getStartDate(){return startDate;}
    public Date getEndDate(){return endDate;}
    public String getReportType(){return reportType;}
    public abstract void makeReport();
}
