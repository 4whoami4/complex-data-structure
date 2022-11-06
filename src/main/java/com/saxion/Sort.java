package com.saxion;

import java.util.ArrayList;

public class Sort {
    public static <T extends Comparable<T>> void Bubble(ArrayList<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static <T extends Comparable<T>> void Selection(ArrayList<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            T temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
    }

    public static <T extends Comparable<T>> void Insertion(ArrayList<T> list) {
        for (int i = 1; i < list.size(); i++) {
            T key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j).compareTo(key) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }

    public static <T extends Comparable<T>> void Merge(ArrayList<T> list) {
        if (list.size() > 1) {
            ArrayList<T> left = new ArrayList<>();
            ArrayList<T> right = new ArrayList<>();
            for (int i = 0; i < list.size() / 2; i++) {
                left.add(list.get(i));
            }
            for (int i = list.size() / 2; i < list.size(); i++) {
                right.add(list.get(i));
            }
            Merge(left);
            Merge(right);
            int i = 0, j = 0, k = 0;
            while (i < left.size() && j < right.size()) {
                if (left.get(i).compareTo(right.get(j)) < 0) {
                    list.set(k, left.get(i));
                    i++;
                } else {
                    list.set(k, right.get(j));
                    j++;
                }
                k++;
            }
            while (i < left.size()) {
                list.set(k, left.get(i));
                i++;
                k++;
            }
            while (j < right.size()) {
                list.set(k, right.get(j));
                j++;
                k++;
            }
        }
    }

    public static <T extends Comparable<T>> void Quick(ArrayList<T> list) {
        Quick(list, 0, list.size() - 1);
    }

    private static <T extends Comparable<T>> void Quick(ArrayList<T> list, int low, int high) {
        if (low < high) {
            int pivot = Partition(list, low, high);
            Quick(list, low, pivot - 1);
            Quick(list, pivot + 1, high);
        }
    }

    private static <T extends Comparable<T>> int Partition(ArrayList<T> list, int low, int high) {
        T pivot = list.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (list.get(j).compareTo(pivot) < 0) {
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
