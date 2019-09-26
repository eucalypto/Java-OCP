package daily._08_20.pre_generics.bottles;

import daily._08_20.pre_generics.liquids.Liquid;

public abstract class Bottle {
    private Liquid content;
    private double volume;

    Bottle(double volume, Liquid content) {
        this.volume = volume;
        this.content = content;
    }

    Liquid getContent() {
        return null;
    }

    public void fill() {
        System.out.println("Filling bottle with "
                + volume
                + " liters of "
                + content.getClass().getSimpleName()
                + " which is " + content.getColor());
    }

    public void empty() {
        System.out.println("Pour out " + content.getClass().getSimpleName() + " from bottle.");
    }

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName();
    }
}
