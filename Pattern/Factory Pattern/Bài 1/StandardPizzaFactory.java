import java.util.List;

public class StandardPizzaFactory implements PizzaFactory {

    //Vai trò: Cung cấp một phương thức cụ thể để tạo Standard Pizza.
    // Tính năng: Người dùng có thể tùy chỉnh mọi thuộc tính.

    @Override
    public Pizza createPizza(String size, String crust, String sauce, List<String> toppings) {
        return new Pizza(size, crust, sauce, toppings);
    }

}
