import model.ContractEmployee;
import model.HourlyEmployee;
import model.SalariedEmployee;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest {

    @Test
    public void givenHourlyEmployeeWhenSetHoursWorkedAndHourlyCostThenShouldReturnProperCalculation(){
        HourlyEmployee hourlyEmployee = new HourlyEmployee("J", "J", 10.6, 36.6);
        double actual = hourlyEmployee.calculatePaycheck();
        double expected = 387.96;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void givenSalariedEmployeeWhenSetHoursWorkedAndHourlyCostThenShouldReturnProperCalculation(){
        SalariedEmployee salariedEmployee = new SalariedEmployee("Barosz", "Kipek", 2100);
        double actual = salariedEmployee.calculatePaycheck();
        double expected = 1617;
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void givenContractEmployeeWhenSetHoursWorkedAndHourlyCostThenShouldReturnProperCalculation(){
        ContractEmployee contractEmployee = new ContractEmployee("Marek", "Citko", 3000);
        double actual = contractEmployee.calculatePaycheck();
        double expected = 2550;
        Assert.assertEquals(expected, actual, 0);
    }
}
