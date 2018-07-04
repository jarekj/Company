package model;

public class ContractEmployee extends Employee{
    protected int contractCost;

    public double calculatePaycheck() {
        return contractCost * 0.85;
    }
}
