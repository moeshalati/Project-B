class A{
    static int a;
    static {
        a = 20;
        System.out.println(a);
    }
}
public class Ex6 {
    public static void main(String[] args) {
        A a1 = new A();
    }
}
