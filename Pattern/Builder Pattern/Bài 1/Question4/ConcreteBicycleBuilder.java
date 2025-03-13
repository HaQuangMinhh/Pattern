import java.util.ArrayList;
import java.util.List;

public class ConcreteBicycleBuilder implements BicycleBuilder {

    private String frameSize ; 
    private String wheelType ; 
    private String gearSystem ; 

    private List<String> accessories = new ArrayList<>() ;


    @Override
    public void addAccessory( List<String> accessory) {
        this.accessories.addAll(accessory);
    }

    @Override
    public void addFrameSize(String size) {
        this.frameSize = size ;
    }

    @Override
    public void addGearSystem(String gear) {
        this.gearSystem = gear ;
        
    }

    @Override
    public void addWheelType(String type) {
        this.wheelType = type ; 
    }

    @Override
    public Bicycle build() {
        return new Bicycle(frameSize, wheelType, gearSystem, accessories);
    }

}
