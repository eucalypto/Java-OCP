package challenges._08_23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WhatDoesCompile {
    public static void main(String[] args) {
        Number[] nums = new Number[10];
        nums[0] = new Integer(4);

        List<Number> numslist = new ArrayList<>();
        numslist.add(new Integer(4));
        System.out.println("numslist = " + numslist);

    }
}
