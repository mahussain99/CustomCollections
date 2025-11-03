package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxiSize;

    public FixedList(int maxiSize) {
        this.maxiSize = maxiSize;
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        if (items.size() < maxiSize) {
            items.add(item);
        } else {
            System.out.println("Do not add number");
        }
    }
    public List<T> getItems(){
        return items;
    }
}

