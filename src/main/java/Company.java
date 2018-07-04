import model.HourlyEmployee;

public class Company {
    public static void main(String[] args) {

        HourlyEmployee he1 = new HourlyEmployee("Jarek", "Browarek", 40, 20);

        System.out.println(he1);
        System.out.println(he1.calculatePaycheck());

    }
}
