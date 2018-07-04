package model;


import java.util.UUID;

public abstract class Employee {
    private String name;
    private String lastName;
    private UUID uuid;

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        uuid = UUID.randomUUID();
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

    public UUID getUuid() {
        return uuid;
    }

    public abstract double calculatePaycheck();

    public abstract void editData();
}
