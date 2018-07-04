package model;

public class HourlyEmployee extends Employee {
    private double hoursWorked;
    private double hourlyCost;

    private HourlyEmployee(String name, String lastName, double hoursWorked, double hourlyCost) {
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

    public static class Builder{
        private String name;
        private String lastName;
        private double hoursWorked;
        private double hourlyCost;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setHoursWorked(double hoursWorked){
            this.hoursWorked = hoursWorked;
            return this;
        }

        public Builder setHourlyCost(double hourlyCost){
            this.hourlyCost = hourlyCost;
            return this;
        }

        public HourlyEmployee build(){
            return new HourlyEmployee(name, lastName, hoursWorked, hourlyCost);
        }

    }
}
