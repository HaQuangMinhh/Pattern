import java.time.LocalDate;

public class hiPriorityConcreteCreator extends RequestCreator {

    @Override
    RequestProduct createRequest() {

        HighPriorityConcrete highPriority = new HighPriorityConcrete();

        highPriority.setPriority("Emergency");
        highPriority.setExpire(LocalDate.now());
        highPriority.setStatus("Accept");
        
        return new HighPriorityConcrete()  ;
    }

}
