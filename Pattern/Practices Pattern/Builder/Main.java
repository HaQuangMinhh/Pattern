public class Main {


    public static void main(String[] args) {
        
        IComputerBuilder builder = new ComputeConcreteBuilder(); 

        ComputerDirector director = new ComputerDirector(builder);

        Computer computer = director.buildGarmingPC();
        Computer computer2 = director.buildOfficePC();
        Computer computer3 = director.buildServer(); 
        
        
        System.out.println(computer);
        System.out.println(computer2);
        System.out.println(computer3);
        
    }

}
