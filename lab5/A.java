package annachiriciuc;

public class A {
    protected static String a;

    protected X x = new X("xxx");

    public A() {

    }

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    public void printValue() {
        System.out.println("State of A: " + a + ", x - " + this.x.getX());
    }
}
