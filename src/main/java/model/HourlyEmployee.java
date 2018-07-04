package model;

public class HourlyEmployee extends Employee {
    protected int hoursWorked;
    protected int hourlyCost;

    


    public double calculatePaycheck() {
        return hourlyCost * hoursWorked;
    }

    public void editData() {

    }
}
