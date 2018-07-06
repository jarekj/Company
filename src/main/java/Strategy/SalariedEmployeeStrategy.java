package Strategy;

import model.Employee;
import model.SalariedEmployee;

import java.util.Scanner;

public class SalariedEmployeeStrategy implements Strategy {
    public Employee buildEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.println("Podaj pensję: ");
        int monthlySalary = scanner.nextInt();

        return new SalariedEmployee.Builder()
                .setName(name)
                .setLastName(lastName)
                .setMonthlyCost(monthlySalary)
                .build();
    }
}
