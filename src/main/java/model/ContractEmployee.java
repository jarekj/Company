package model;

public class ContractEmployee extends Employee {
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

    public int getContractCost() {
        return contractCost;
    }

    public void setContractCost(int contractCost) {
        this.contractCost = contractCost;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                " name=" + getName() +
                ", lastname=" + getLastName() +
                ", id=" + getUuid() +
                ", contractCost=" + contractCost +
                '}';
    }
}
