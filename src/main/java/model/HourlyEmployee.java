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

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHourlyCost() {
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
