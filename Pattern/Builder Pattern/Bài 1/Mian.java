public class Mian {


    public static void main(String[] args) {
        
        PizzaBuilder builder = new PizzaConcreteBuilder1();

        PizzaDirector director = new PizzaDirector(builder);
        
        Pizza pizza = director.buildCustomPizza();
        
        System.out.println(pizza);

    }

    // Ý nghĩa giải thích các Class
    
    // Product : Pizza (có size, crust, sauce, toppings) 
    // Đối tượng bạn muốn tạo

    // Builder : Giao diện xác định cách xây dựng đối tượng.
    // PizzaBuilder (có setSize, setCrust, ...)

    // ConcreteBuilder (Bộ xây dựng cụ thể) : Cài đặt cụ thể giao diện Builder.
    // PizzaConcreteBuilder1 (tạo pizza theo yêu cầu)

    // Director (Giám đốc) : Điều phối việc xây dựng theo thứ tự.
    // PizzaDirector (xây dựng pizza mặc định)

    // Client (Khách hàng) : Gọi Director để lấy sản phẩm.
    // BuilderPatternWithDirectorDemo (gọi và in pizza ra)


}
