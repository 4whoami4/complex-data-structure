package com.saxion.utils;

import com.saxion.records.HasId;

import java.util.ArrayList;
import java.util.List;

public class Sort {
    public static <T extends HasId> void Bubble(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).id() > list.get(j + 1).id()) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static <T extends HasId> void Selection(List<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).id() < list.get(min).id())
                    min = j;
            }
            T temp = list.get(i);
            list.set(i, list.get(min));
            list.set(min, temp);
        }
    }

    public static <T extends HasId> void Insertion(List<T> list) {
        for (int i = 1; i < list.size(); i++) {
            T temp = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).id() > temp.id()) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, temp);
        }
    }

    public static <T extends HasId> void Merge(List<T> list) {
        if (list.size() > 1) {
            int mid = list.size() / 2;
            List<T> left = new ArrayList<>(list.subList(0, mid));
            List<T> right = new ArrayList<>(list.subList(mid, list.size()));
            Merge(left);
            Merge(right);
            int i = 0, j = 0, k = 0;
            while (i < left.size() && j < right.size()) {
                if (left.get(i).id() < right.get(j).id())
                    list.set(k++, left.get(i++));
                else
                    list.set(k++, right.get(j++));
            }
            while (i < left.size())
                list.set(k++, left.get(i++));
            while (j < right.size())
                list.set(k++, right.get(j++));
        }
    }

    public static <T extends HasId> void Quick(List<T> list) {
        Quick(list, 0, list.size() - 1);
    }

    private static <T extends HasId> void Quick(List<T> list, int low, int high) {
        if (low < high) {
            int pivot = Partition(list, low, high);
            Quick(list, low, pivot - 1);
            Quick(list, pivot + 1, high);
        }
    }

    private static <T extends HasId> int Partition(List<T> list, int low, int high) {
        T pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j).id() < pivot.id()) {
                i++;
                T temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);
            }
        }
        T temp = list.get(i + 1);
        list.set(i + 1, list.get(high));
        list.set(high, temp);
        return i + 1;
    }
}