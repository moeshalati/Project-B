class Parent{
    public void greeting(String name){
        System.out.println("Welcome "+ name);
    }
}

class Child extends Parent{
    public void greeting(String name){
        System.out.println("Hello "+ name);
    }
}


public class Ex9 {
    public static void main(String[] args) {
        Child child = new Child();
        child.greeting("Mark");
    }
}
