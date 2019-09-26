package de.papara.sudoku;

import java.util.LinkedHashSet;
import java.util.Set;

public class NumberField {
    Set<Integer> possibilities = new LinkedHashSet<>();

    public NumberField() {
        for (int i = 1; i <= 9; i++)
            possibilities.add(i);
    }

    @Override
    public String toString() {
        if (possibilities.size() > 1)
            return "?";
        else if (possibilities.size() == 1)
            return null;
        return null;
    }
}
