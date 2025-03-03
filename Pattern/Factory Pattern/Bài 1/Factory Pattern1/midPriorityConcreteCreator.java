import java.time.LocalDate;

public class midPriorityConcreteCreator extends RequestCreator {

    @Override
    RequestProduct createRequest() {
        
        MediumPriorityConcrete mediumConcrete = new MediumPriorityConcrete();
        mediumConcrete.setPriority("Medium");
        mediumConcrete.setExpire(LocalDate.now().plusMonths(1));
        mediumConcrete.setStatus("Accepted");
        
        return new MediumPriorityConcrete() ;
    }

}
