import model.ContractEmployee;

public class Company {
    public static void main(String[] args) {

        ContractEmployee contractEmployee = new ContractEmployee.Builder()
                .setName("Jarek")
                .setLastName("Citko")
                .setContractCost(1800)
                .build();

        System.out.println(contractEmployee);


    }
}
