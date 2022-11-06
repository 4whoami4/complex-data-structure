package com.saxion.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Search {
    public static <T> T Linear(Iterable<T> list, T value) {
        for (T item : list) {
            if (item.equals(value))
                return item;
        }
        return null;
    }

    public static <T> T Linear(HashMap<Integer, T> map, T value) {
        return Linear(map.values(), value);
    }

    public static <T extends Comparable<T>> T Binary(List<T> list, T value) {
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

    public static <T extends Comparable<T>> T Binary(Map<Integer, T> map, T value) {
        // Idk
        return null;
    }
}
