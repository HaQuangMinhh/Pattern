public class PizzaDirector {

    private PizzaBuilder builder ;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    } 

    public Pizza buildCustomPizza() {
        builder.setSize("Small");
        builder.setCrust("Thin");
        builder.setSauce("Tomato");
        builder.addToping("Mushrooms");
        builder.addToping("Pepperoni");

        return builder.build();
    }

}
