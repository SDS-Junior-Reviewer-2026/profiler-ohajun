package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Profiler profiler = new Profiler();
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 2, 4, 1, 3, 9));
        profiler.setData(input);
        profiler.setLib(new BubbleSort());
        profiler.runLib();
        profiler.showResults();
    }
}