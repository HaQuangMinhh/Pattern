public class NormalCalculator implements Calculator {

    private int a , b ; 
    
    @Override
    public int addition() {
        return a + b ; 
    }

    @Override
    public int division() {
        return -1;
    }

    @Override
    public int multiplication() {
        return -1;
    }

    @Override
    public int subtraction() {
        
        return  a - b ;
    }

    @Override
    public void setOperand(int a, int b) {
        this.a = a ; 
        this.b = b ; 
    }
}
