import model.ContractEmployee;
import model.HourlyEmployee;
import model.SalariedEmployee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void givenHourlyEmployeeWhenSetHoursWorkedAndHourlyCostThenShouldReturnProperCalculation(){
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
    public void givenSalariedEmployeeWhenSetSalaryCostThenShouldReturnProperCalculation(){
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
    public void givenContractEmployeeWhenSetHoursWorkedAndHourlyCostThenShouldReturnProperCalculation(){

        ContractEmployee contractEmployee = new ContractEmployee.Builder()
                .setName("Marek")
                .setLastName("Citko")
                .setContractCost(3000)
                .build();

        double actual = contractEmployee.calculatePaycheck();
        double expected = 2550;

        Assert.assertEquals(expected, actual, 0);
    }
}
