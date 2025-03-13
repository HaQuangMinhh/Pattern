public class Main {


    public static void main(String[] args) {
        
        BicycleBuilder builder = new ConcreteBicycleBuilder();

        BicycleDirector director = new BicycleDirector(builder);

        Bicycle bicycle = director.buildBicycle(); 

        System.out.println(bicycle);

    }
}
