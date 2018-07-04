package model;

public class ContractEmployee extends Employee {
    private int contractCost;

    private ContractEmployee(String name, String lastName, int contractCost) {
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

    public static class Builder{
        private String name;
        private String lastName;
        private int contractCost;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setContractCost(int contractCost){
            this.contractCost = contractCost;
            return this;
        }


        public ContractEmployee build(){
            return new ContractEmployee(name, lastName, contractCost);
        }

    }
}
