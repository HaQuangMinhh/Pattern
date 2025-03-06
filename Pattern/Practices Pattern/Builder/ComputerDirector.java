public class ComputerDirector {

    private IComputerBuilder builder ;

    public ComputerDirector(IComputerBuilder builder) {
        this.builder = builder;
    } 

    public Computer buildGarmingPC() {
        builder.setMotherBoard("High-end CPU");
        builder.setGpu("GPU");
        builder.setStorage("128GB");
        builder.setCoolingSystem(true);
        

        return builder.buildComputer(); 
    }

    public Computer buildOfficePC() {
        builder.setMotherBoard("Mid-range CPU");
       
        builder.setStorage("128GB");
        builder.setCoolingSystem(true);
        builder.setPowerSupply("No");

        return builder.buildComputer(); 
    }
    
    public Computer buildServer() {
       
        builder.setGpu(" High RAM");
        builder.setStorage("Multiple HDDs");
        builder.setCoolingSystem(true);
       

        return builder.buildComputer(); 
    }
}
