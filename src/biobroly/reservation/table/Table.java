package reservation.table;

public abstract class Table {
    protected int id;
    protected int capacity;
    protected String state;
    public abstract void printTable();
}
