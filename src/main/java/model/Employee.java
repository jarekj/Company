package model;

public abstract class Employee {
    private String name;
    private String lastName;
    private int id;
    private static int count;

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.id = count;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public abstract double calculatePaycheck();

    public abstract void editData();
}
