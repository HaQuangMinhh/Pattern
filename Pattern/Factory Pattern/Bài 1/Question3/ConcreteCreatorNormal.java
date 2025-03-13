public class ConcreteCreatorNormal extends Creator {

    @Override
    Calculator createCalculator() {
        // TODO Auto-generated method stub
        return new NormalCalculator();
    }



}
