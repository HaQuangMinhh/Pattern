import java.util.ArrayList;
import java.util.List;

public class PepperoniPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String size, String crust, String sauce, List<String> toppings) {
        
        if ( toppings == null ) {
            toppings = new ArrayList<>(); 
        }
        toppings.add("Pepperoni");

        return new Pizza(size, crust, sauce, toppings) ;
    }

    // Tạo Pepperoni Pizza với topping cố định là pepperoni.
    // Tính năng: Người dùng có thể tùy chỉnh kích thước, vỏ bánh và nước sốt.



}
