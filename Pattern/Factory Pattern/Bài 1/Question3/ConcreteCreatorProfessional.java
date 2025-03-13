public class ConcreteCreatorProfessional extends Creator {

    @Override
    Calculator createCalculator() {
        
        return new ProfessionalCalculator();
    }



}
