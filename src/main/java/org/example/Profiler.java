package org.example;

import java.util.ArrayList;

public class Profiler {
    private ArrayList<Integer> data;
    private SortServiceLib sort;

    public void setData(ArrayList<Integer> input) {
        data = new ArrayList<>(input);
    }

    public void setLib(SortServiceLib sort) {
        this.sort = sort;
    }

    public void runLib() {
        sort.sort(data);
    }

    public void showResults() {
        System.out.println("정렬 결과 :" + data);
        System.out.println("swap 횟수 : " + sort.getChangeCnt());
    }
}
