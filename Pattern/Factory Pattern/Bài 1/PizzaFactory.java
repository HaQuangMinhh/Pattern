import java.util.List;

public interface PizzaFactory {

    // Vai trò: Định nghĩa giao diện cho phương thức tạo (createPizza).
    // Mục tiêu: Cho phép các lớp con ghi đè để chỉ định loại pizza cụ thể nào sẽ được tạo ra.
    
    Pizza createPizza ( String size , String crust , String sauce, List<String> toppings );

}
