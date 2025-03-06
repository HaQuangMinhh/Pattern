public class Computer {

    private String motherBoard ;
    private String powerSupply ; 

    private String gpu ; 
    private String storage ; 
    private boolean coolingSystem ;
    
    
    public Computer(String motherBoard, String powerSupply, String gpu, String storage, boolean coolingSystem) {
        this.motherBoard = motherBoard;
        this.powerSupply = powerSupply;
        this.gpu = gpu;
        this.storage = storage;
        this.coolingSystem = coolingSystem;
    }


    @Override
    public String toString() {
        return "Computer [motherBoard=" + motherBoard + ", powerSupply=" + powerSupply + ", gpu=" + gpu + ", storage="
                + storage + ", coolingSystem=" + coolingSystem + "]";
    } 

    
}
