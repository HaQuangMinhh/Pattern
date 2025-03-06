public class ComputeConcreteBuilder implements IComputerBuilder {

    private String motherBoard ;
    private String powerSupply ; 

    private String gpu ; 
    private String storage ; 
    private boolean coolingSystem ;

    @Override
    public Computer buildComputer() {
        return new Computer(motherBoard, powerSupply, gpu, storage, coolingSystem) ;
    }

    @Override
    public void setCoolingSystem(boolean cooling) {
        this.coolingSystem = cooling ; 
        
    }

    @Override
    public void setGpu(String gpu) {
        this.gpu = gpu ; 
        
    }

    @Override
    public void setMotherBoard(String motherBoard) {
        this.motherBoard = motherBoard ; 
        
    }

    @Override
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply ; 
        
    }

    @Override
    public void setStorage(String storage) {
        this.storage = storage ; 
        
    }


}
