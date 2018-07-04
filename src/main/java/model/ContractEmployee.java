package model;

public class ContractEmployee extends Employee{
    private int contractCost;

    public ContractEmployee(String name, String lastName, int contractCost) {
        super(name, lastName);
        this.contractCost = contractCost;
    }

    public double calculatePaycheck() {
        return contractCost * 0.85;
    }

    public void editData() {

    }
}
