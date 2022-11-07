package com.saxion.utils;

import com.saxion.records.HasId;

import java.util.List;

public class Search {
    public static <T extends HasId> T Linear(Iterable<T> list, int id) {
        for (T item : list) {
            if (item.id() == id)
                return item;
        }
        return null;
    }

    public static <T extends HasId> T Binary(List<T> list, int id) {
        int low = 0, mid, high = list.size() - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (list.get(mid).id() < id)
                low = mid + 1;
            else if (list.get(mid).id() > id)
                high = mid - 1;
            else
                return list.get(mid);
        }
        return null;
    }
}
