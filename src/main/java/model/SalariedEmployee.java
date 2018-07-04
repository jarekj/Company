package model;

public class SalariedEmployee extends Employee {
    private int monthlySalary;

    private SalariedEmployee(String name, String lastName, int monthlySalary) {
        super(name, lastName);
        this.monthlySalary = monthlySalary;
    }

    public double calculatePaycheck() {
        return monthlySalary * 0.77;
    }

    public void editData() {

    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                " name=" + getName() +
                ", lastname=" + getLastName() +
                ", id=" + getUuid() +
                ", monthlySalary=" + monthlySalary +
                '}';
    }

    public static class Builder{
        private String name;
        private String lastName;
        private int monthlySalary;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setContractCost(int contractCost){
            this.monthlySalary = contractCost;
            return this;
        }


        public SalariedEmployee build(){
            return new SalariedEmployee(name, lastName, monthlySalary);
        }

    }
}
