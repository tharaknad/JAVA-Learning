package demo1;

public class MathImpl3 extends MathImpl {

    int d;
    int e;
    

    public MathImpl3(int d, int e) {
        this.d = d;
        this.e = e;
    }

    @Override
    public void multiply() {
       int c = d * e;
        System.out.println("Multiply of given: "+c);
    }

    @Override
    public void division() {
       int  c = d / e;
        System.out.println("divison of given: "+c);
    }
}