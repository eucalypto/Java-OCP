package daily._08_23;

import daily._08_23.beverages.Beverage;
import daily._08_23.bottles.Bottle;

import java.util.ArrayList;
import java.util.List;

public class Crate<BottleT extends Bottle<? extends Beverage>> {
    private int capacity;
    private List<BottleT> bottles = new ArrayList<>();

    public Crate(int capacity) {
        this.capacity = capacity;
    }

    public void put(BottleT bottle) {
        if (bottles.size() >= capacity) throw new CrateEmpty();
        // else

    }

    @Override
    public String toString() {
        String ret = "Crate filled with: [";
        for (BottleT bottle : bottles) ret = ret.join(", ", bottle.toString());
        return ret;
    }

}
