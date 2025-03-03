public class Main {

    public static void main(String[] args) {
        
        lowPriorityConcreteCreator creator = new lowPriorityConcreteCreator();

        RequestProduct product = creator.createRequest();

        product.processRequest();
        
        System.out.println("-------------------------------------");

        hiPriorityConcreteCreator creator2 = new hiPriorityConcreteCreator(); 

        RequestProduct product1 = creator2.createRequest(); 

        product1.processRequest();
        
        System.out.println("-------------------------------------");

        midPriorityConcreteCreator creator3 = new midPriorityConcreteCreator();

        RequestProduct product2 = creator3.createRequest();

        product2.processRequest();

    }
}
