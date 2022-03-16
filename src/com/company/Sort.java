package com.company;

import java.util.Comparator;

public class Sort implements Comparator<Float> {
    @Override
    public int compare(Float o1, Float o2) {
        return o1.intValue() - o2.intValue();
    }
}
