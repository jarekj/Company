package Strategy;

import model.Employee;
import model.HourlyEmployee;

import java.util.Scanner;

public class HourlyEmployeeStrategy implements Strategy{
    public Employee buildEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj stawkę godzinową: ");
        double hourlyCost = scanner.nextDouble();
        System.out.println("Podaj ilość przepracowanych godzin: ");
        double hoursWorked = scanner.nextDouble();

        return new HourlyEmployee.Builder()
                .setName(name)
                .setLastName(lastName)
                .setHourlyCost(hourlyCost)
                .setHoursWorked(hoursWorked)
                .build();
    }
}
