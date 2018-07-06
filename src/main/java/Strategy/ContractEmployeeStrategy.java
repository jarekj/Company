package Strategy;

import model.ContractEmployee;
import model.Employee;

import java.util.Scanner;

public class ContractEmployeeStrategy implements Strategy {
    public Employee buildEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.print("Podaj nazwisko: ");
        String lastName = scanner.nextLine();
        System.out.print("Podaj pensję: ");
        int contractCost = scanner.nextInt();

        return new ContractEmployee.Builder()
                .setName(name)
                .setLastName(lastName)
                .setContractCost(contractCost)
                .build();
    }
}
