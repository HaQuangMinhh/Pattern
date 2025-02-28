import java.util.ArrayList;
import java.util.List;

public class PizzaConcreteBuilder1 implements PizzaBuilder{

    private String size ; 
    private String crust ; 
    private String sauce ; 
    private List<String> toppings = new ArrayList<>();

    @Override
    public void addToping(String topping) {
        toppings.add(topping);
        
    }
    @Override
    public Pizza build() {
        return new Pizza( size, crust , sauce, toppings );
    }
    @Override
    public void setCrust(String crust) {
        this.crust = crust ; 
        
    }
    @Override
    public void setSauce(String sauce) {
        this.sauce = sauce ; 
        
    }
    @Override
    public void setSize(String size) {
        this.size = size ;
        
    } 

}
