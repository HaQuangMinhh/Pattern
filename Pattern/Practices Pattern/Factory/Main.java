public class Main {


    public static void main(String[] args) {
        
        Employee employee1 = EmployeeFactory.createEmployee("parttime");
        System.out.println(employee1.calculateSalary());
        System.out.println(employee1.getBenefits());

        System.out.println("---------------------------------------");

        Employee employee2 = EmployeeFactory.createEmployee("fulltime");
        System.out.println(employee2.calculateSalary());
        System.out.println(employee2.getBenefits());

        System.out.println("---------------------------------------");

        Employee employee3 = EmployeeFactory.createEmployee("intern");
        System.out.println(employee3.calculateSalary());
        System.out.println(employee3.getBenefits());

        System.out.println("---------------------------------------");

    }


}
