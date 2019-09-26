package daily._08_21;

public class GenericsTester {
    public static void main(String[] args) {

        C<A> cca = new C<>();
        System.out.println("cca = " + cca);

        C<A> cca2 = (C) new C<B>();
        System.out.println("cca2 = " + cca2);
        C cca3 = new C();
        System.out.println("cca3 = " + cca3);
        System.out.println(cca2 instanceof C);
        System.out.println("hello");

    }
}

class C<T> {
}

class A {
}

class B {
}

class CA extends A {
}
