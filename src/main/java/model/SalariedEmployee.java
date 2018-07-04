package model;

public class SalariedEmployee extends Employee {
    protected int monthlySalary;

    public double calculatePaycheck() {
        return monthlySalary * 0.77;
    }
}
