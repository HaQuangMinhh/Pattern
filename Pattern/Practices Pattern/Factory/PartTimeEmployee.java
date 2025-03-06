public class PartTimeEmployee extends Employee {

    @Override
    double calculateSalary() {
        
        return 100000;
    }

    @Override
    String getBenefits() {
        
        return "Flexible hours";
    }



}
