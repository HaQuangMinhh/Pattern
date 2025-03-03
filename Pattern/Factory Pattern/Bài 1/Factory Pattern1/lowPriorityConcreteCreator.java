import java.time.LocalDate;

public class lowPriorityConcreteCreator extends RequestCreator  {

    @Override
    RequestProduct createRequest() {
        LowPriorityConcrete lowPriority = new LowPriorityConcrete(); 
        lowPriority.setPriority("Ignore");
        lowPriority.setExpire( LocalDate.now() );
        lowPriority.setStatus("Done");

        return lowPriority;
    }

}
