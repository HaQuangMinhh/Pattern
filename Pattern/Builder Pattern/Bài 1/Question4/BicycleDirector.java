import java.util.Arrays;

public class BicycleDirector {

    private BicycleBuilder builder;

    public BicycleDirector(BicycleBuilder builder) {
        this.builder = builder;
    }

    public Bicycle buildBicycle() {
        builder.addFrameSize("Medium");
        builder.addWheelType("Mountain Bike");
        builder.addGearSystem("Speed");
        builder.addAccessory(Arrays.asList("Bell", "Holder"));

        return builder.build();
    }

}
