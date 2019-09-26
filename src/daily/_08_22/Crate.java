package daily._08_22;

import daily._08_20.pre_generics.bottles.Bottle;

import java.util.ArrayList;
import java.util.List;


public class Crate<BottleType extends Bottle> {
    private int capacity;
    private List<BottleType> bottles;
    {
        bottles = new ArrayList<>();
    }



    Crate(int capacity) { this.capacity = capacity; }

    void put(BottleType bttl) throws CrateFull {
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

    // static class CrateFull extends Exception {}
    static class CrateFull extends RuntimeException {}
    // static class CrateEmpty extends Exception {}
    static class CrateEmpty extends RuntimeException {}

}
