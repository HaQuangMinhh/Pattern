public class FullTimeEmployee extends Employee  {

    @Override
    double calculateSalary() {
        
        return 500000 ; 
    }

    @Override
    String getBenefits() {
        return "received more money";
    }


}
