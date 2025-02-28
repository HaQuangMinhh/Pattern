
public interface PizzaBuilder {

    // Tat ca các thao tac khac nhau tren tung san pham
    void setSize (String size);
    void setCrust (String crust ) ; 
    void setSauce (String sauce ) ; 
    void addToping (String topping) ; 

    Pizza build(); 

}
