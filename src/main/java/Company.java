import Strategy.*;
import model.Employee;

import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Strategy strategy;

        System.out.println("1. Zbuduj SalaryEmployee");
        System.out.println("2. Zbuduj HourlyEmployee");
        System.out.println("3. Zbuduj ContractEmployee");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();


        switch (input) {
            case 1:
                strategy = new SalariedEmployeeStrategy();
                break;
            case 2:
                strategy = new HourlyEmployeeStrategy();
                break;
            case 3:
                strategy = new ContractEmployeeStrategy();
                break;
            default:
                return;
        }
        Employee employee = strategy.buildEmployee();
        System.out.println(employee);


    }
}
