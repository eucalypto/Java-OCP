package exploringJava.classes.abstractHeritage;

public class AbstractExplorer {
    public static void main(String[] args) {

    }
}

abstract class Shapes {
    public abstract void lookPretty();

    protected abstract void exist();

    abstract void align();
    // private abstract void think(); // No one knows the thoughts of triangles...
}

class Triangle extends Shapes {

    @Override
    public void lookPretty() {
        System.out.println("Look how pretty this triangle is!");
    }
    // Must be public, can't be private, package-private, or protected because of visibility
    // of overridden method

    @Override
    public void exist() {
        System.out.println("Do triangles exist in reality or just in our minds?");
    }

    @Override
    void align() {
        System.out.println("This triangle aligns well with other triangles.");
    }
}

/**
 * We can extend a concrete class with an abstract class, apparently.
 */
abstract class LoveTriangle extends Triangle {

    @Override
    public abstract void exist();
    // Apparently, it's ok to override a concrete method with an abstract one!
    // I'm not sure how useful this is, but the compiler is happy with it.

    @Override
    public abstract void lookPretty();
}

class NobodyReallyCares extends LoveTriangle {

    @Override
    public void exist() {
    }
    // now we have to implement the abstract-made methods from the parent class.

    @Override
    public void lookPretty() {

    }
}
