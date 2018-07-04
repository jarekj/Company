package model;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private int hourlyCost;

    public HourlyEmployee(String name, String lastName, int hoursWorked, int hourlyCost) {
        super(name, lastName);
        this.hoursWorked = hoursWorked;
        this.hourlyCost = hourlyCost;
    }

    public double calculatePaycheck() {
        return hourlyCost * hoursWorked;
    }

    public void editData() {

    }
}
