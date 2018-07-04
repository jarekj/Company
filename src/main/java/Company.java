import model.ContractEmployee;
import model.HourlyEmployee;

public class Company {
    public static void main(String[] args) {

        ContractEmployee contractEmployee = new ContractEmployee.Builder()
                .setName("Jarek")
                .setLastName("Citko")
                .setContractCost(1800)
                .build();

        System.out.println(contractEmployee);

        HourlyEmployee hourlyEmployee = new HourlyEmployee.Builder()
                .setName("Krzysztof")
                .setLastName("Zalewski")
                .setHourlyCost(11.6)
                .setHoursWorked(40)
                .build();

        System.out.println(hourlyEmployee + " paycheck " + hourlyEmployee.calculatePaycheck());


    }
}
