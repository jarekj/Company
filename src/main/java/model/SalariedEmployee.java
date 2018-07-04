package model;

public class SalariedEmployee extends Employee {
    private int monthlySalary;

    public SalariedEmployee(String name, String lastName, int monthlySalary) {
        super(name, lastName);
        this.monthlySalary = monthlySalary;
    }

    public double calculatePaycheck() {
        return monthlySalary * 0.77;
    }

    public void editData() {

    }
}
