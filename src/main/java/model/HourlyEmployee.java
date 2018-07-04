package model;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyCost;

    public HourlyEmployee(String name, String lastName, double hoursWorked, double hourlyCost) {
        super(name, lastName);
        this.hoursWorked = hoursWorked;
        this.hourlyCost = hourlyCost;
    }

    public double calculatePaycheck() {
        return hourlyCost * hoursWorked;
    }

    public void editData() {

    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyCost() {
        return hourlyCost;
    }

    public void setHourlyCost(int hourlyCost) {
        this.hourlyCost = hourlyCost;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                " name= " + getName() +
                ", lastname=" + getLastName() +
                ", id= " + getUuid() +
                ", hoursWorked= " + hoursWorked +
                ", hourlyCost= " + hourlyCost +
                '}';
    }
}
