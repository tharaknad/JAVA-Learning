package demo1;

public class MathImpl2 extends MathImpl {

    int a;
    int b;
    

    public MathImpl2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void addition() {
       int c = a + b;
        System.out.println("Addition of given: "+c);
    }

    @Override
    public void substraction() {
       int c = a - b;
        System.out.println("Differnece of given: "+c);
    }
}
