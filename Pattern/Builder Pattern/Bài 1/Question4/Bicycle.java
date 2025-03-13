import java.util.List;

public class Bicycle {


    private String frameSize ; 
    private String wheelType ; 
    private String gearSystem ; 

    private List<String> accessories ;

    public Bicycle(String frameSize, String wheelType, String gearSystem, List<String> accessories) {
        this.frameSize = frameSize;
        this.wheelType = wheelType;
        this.gearSystem = gearSystem;
        this.accessories = accessories;
    }

    @Override
    public String toString() {
        return "Bicycle [frameSize=" + frameSize + ", wheelType=" + wheelType + ", gearSystem=" + gearSystem
                + ", accessories=" + accessories + "]";
    } 

    
}
