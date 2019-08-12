package questionsTesting._2019_08_12;

interface MyInterface { void method();}

class MyClass implements MyInterface {
    void MyClass(String s) {

    }

    @Override
    public void method() {
        System.out.println("A");
        System.out.print("hello");
        System.out.println();
    }
}

public class InterfaceTest {
    final static int in;
    static {in = 11;}
    public InterfaceTest() {
        // in = 10;
    }

    public static void main(String[] args) {
        System.out.println(in);
    }
}
