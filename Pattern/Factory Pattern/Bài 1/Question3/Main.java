public class Main {


    public static void main(String[] args) {
        
        Creator factory = new ConcreteCreatorProfessional(); 

        Calculator calculator = factory.createCalculator();

        calculator.setOperand(10, 5);

        System.out.println("Result: " + calculator.multiplication());
        System.out.println("Result: " + calculator.addition());
        System.out.println("result:" + calculator.division());
        System.out.println("Result: " + calculator.subtraction());
        
    }

}
