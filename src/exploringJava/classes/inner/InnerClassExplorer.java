package exploringJava.classes.inner;

public class InnerClassExplorer {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Inner inner2 = outer.new Inner();

        Outer.Inner inner3 = new Outer().new Inner(); // compliler: Ok
        Outer.Inner inner4 = (new Outer()).new Inner(); // compliler: Ok
        // Outer.Inner inner5 = (new Outer()).(new Inner()); // compliler: not Ok!


        Outer.Inner.InnerInner innerInner1 = inner.new InnerInner();
        Outer.Inner.InnerInner innerInner2 = new Outer().new Inner().new InnerInner();
        // I think I have made my point. From now on, there are turtles (inner) all the way down.


    }
}

class Outer {
    Outer() {
        System.out.println("Beware, this is Outer class, I have been born.");
    }

    class Inner {
        Inner() {
            System.out.println("Beware, this is inner class. I have been born.");
        }

        class InnerInner {
            InnerInner() {
                System.out.println("Why stop here? This is InnerInner class!");
            }
        }
    }
}
