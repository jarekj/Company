import model.ContractEmployee;
import model.HourlyEmployee;
import model.SalariedEmployee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void givenHourlyEmployeeWhenSetHoursWorkedAndHourlyCostThenShouldReturnProperCalculation() {
        HourlyEmployee hourlyEmployee = new HourlyEmployee.Builder()
                .setName("Jarek")
                .setLastName("J")
                .setHoursWorked(10.6)
                .setHourlyCost(36.6)
                .build();

        double actual = hourlyEmployee.calculatePaycheck();
        double expected = 387.96;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void givenSalariedEmployeeWhenSetSalaryCostThenShouldReturnProperCalculation() {
        SalariedEmployee salariedEmployee = new SalariedEmployee.Builder()
                .setName("Bartosz")
                .setLastName("Kipek")
                .setContractCost(2100)
                .build();

        double actual = salariedEmployee.calculatePaycheck();
        double expected = 1617;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void givenContractEmployeeWhenSetHoursWorkedAndHourlyCostThenShouldReturnProperCalculation() {

        ContractEmployee contractEmployee = new ContractEmployee.Builder()
                .setName("Marek")
                .setLastName("Citko")
                .setContractCost(3000)
                .build();

        double actual = contractEmployee.calculatePaycheck();
        double expected = 2550;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void shoudlReturnNewContractEmployeeWhenUsingBuilderConstructor() {
        ContractEmployee contractEmployee = new ContractEmployee.Builder()
                .setName("Marek")
                .setLastName("Citko")
                .setContractCost(3000)
                .build();

        String expectedName = "Marek";
        String expectedLastName = "Citko";
        int expectedContractCost = 3000;

        Assert.assertEquals(expectedName, contractEmployee.getName());
        Assert.assertEquals(expectedLastName, contractEmployee.getLastName());
        Assert.assertEquals(expectedContractCost, contractEmployee.getContractCost());
    }

    @Test
    public void shoudlReturnNewHourlyEmployeeWhenUsingBuilderConstructor() {
        HourlyEmployee hourlyEmployee = new HourlyEmployee.Builder()
                .setName("Marek")
                .setLastName("Citko")
                .setHoursWorked(43.4)
                .setHourlyCost(15.5)
                .build();

        String expectedName = "Marek";
        String expectedLastName = "Citko";
        double expectedHoursWorked = 43.4;
        double expectedHourlyCost = 15.5;

        Assert.assertEquals(expectedName, hourlyEmployee.getName());
        Assert.assertEquals(expectedLastName, hourlyEmployee.getLastName());
        Assert.assertEquals(expectedHoursWorked, hourlyEmployee.getHoursWorked(), 0);
        Assert.assertEquals(expectedHourlyCost, hourlyEmployee.getHourlyCost(), 0);
    }

    @Test
    public void shoudlReturnNewSalaryEmployeeWhenUsingBuilderConstructor() {
        SalariedEmployee salariedEmployee = new SalariedEmployee.Builder()
                .setName("Jerzy")
                .setLastName("Podbrożny")
                .setContractCost(1000)
                .build();

        String expectedName = "Jerzy";
        String expectedLastName = "Podbrożny";
        int expectedMonthlyCost = 1000;

        Assert.assertEquals(expectedName, salariedEmployee.getName());
        Assert.assertEquals(expectedLastName, salariedEmployee.getLastName());
        Assert.assertEquals(expectedMonthlyCost, salariedEmployee.getMonthlySalary());
    }
}
