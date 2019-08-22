package challenges._08_22;

import challenges._08_20.pre_generics.bottles.Bottle;

import java.util.ArrayList;
import java.util.List;


/**
 * This class represents a beverage crate that holds bottles of beverages.
 *
 * Drawbacks:
 *  It can hold any combination of bottle types. You can mix them. But this is not
 *  necessarily what you want.
 */
public class BeverageCrate {
    private int capacity;
    private List<Bottle> bottles;

    {
        bottles = new ArrayList<>();
    }

    BeverageCrate(int capacity) { this.capacity = capacity; }

    void put(Bottle bttl) throws CrateFull {
        if ( !(bottles.size() < capacity) ) throw new CrateFull();
        // else
        bottles.add(bttl);
    }

    Bottle take() throws CrateEmpty {
        if (bottles.size() == 0) throw new CrateEmpty();
        // else

        int lastindex = bottles.size() -1;
        Bottle ret = bottles.get(lastindex);
        bottles.remove(lastindex);
        return ret;
    }

    @Override
    public String toString() {
        return "BeverageCrate{" +
                "capacity=" + capacity + " ; " +
                bottles.size() + " bottles in crate" +
                '}';
    }

    int getCapacity() { return capacity; }

    static class CrateFull extends Exception {}
    static class CrateEmpty extends Exception {}
}

