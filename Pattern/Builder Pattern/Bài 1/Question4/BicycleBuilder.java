import java.util.List;

public interface BicycleBuilder {

    void addFrameSize( String size  ) ; 
    void addWheelType ( String type  );
    void addGearSystem ( String gear );
    void addAccessory ( List<String> accessories );

    Bicycle build();
}
