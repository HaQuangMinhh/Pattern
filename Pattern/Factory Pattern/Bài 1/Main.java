import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        
        // Sử dụng StandardPizzaFactory
        PizzaFactory factory1 = new StandardPizzaFactory(); 
        List<String> toppings1 = new ArrayList<>(Arrays.asList("Mushrooms", "Onions"));
        Pizza pizza1 = factory1.createPizza("Large", "Thin", "Tomato", toppings1);


        // Sử dụng PepperoniPizzaFactory
        PizzaFactory factory2 = new PepperoniPizzaFactory();
        List<String> toppings2 = new ArrayList<>(Arrays.asList("Cheese"));
        Pizza pizza2 = factory2.createPizza("Medium", "Thick", "BBQ", toppings2);


        System.out.println(pizza1);
        System.out.println("----------------------------------");
        
        System.out.println(pizza2);

    }


}
