public class ProfessionalCalculator implements Calculator {
    private int a , b ; 


    @Override
    public int addition() {
        return a + b ; 
    }

    @Override
    public int division() {
        return ( b != 0) ? a /b : -1 ; 
    }

    @Override
    public int multiplication() {
        
        return a * b;
    }

    @Override
    public void setOperand(int a, int b) {
        this.a = a ;
        this.b = b ; 
    }

    @Override
    public int subtraction() {
        return a - b;
    }


}
