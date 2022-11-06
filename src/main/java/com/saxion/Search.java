package com.saxion;

import java.util.ArrayList;

public class Search {
    public static <T> T Linear(ArrayList<T> list, T value) {
        for (T item : list) {
            if (item.equals(value))
                return item;
        }
        return null;
    }

    public static <T extends Comparable<T>> T Binary(ArrayList<T> list, T value) {
        int low = 0, mid, high = list.size() - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (list.get(mid).compareTo(value) < 0) {
                low = mid + 1;
            } else if (list.get(mid).compareTo(value) > 0) {
                high = mid - 1;
            } else {
                return list.get(mid);
            }
        }
        return null;
    }
}
