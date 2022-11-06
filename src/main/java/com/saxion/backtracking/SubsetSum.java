package com.saxion.backtracking;

import com.saxion.Sort;

import java.util.ArrayList;

public class SubsetSum {

    public ArrayList<int[]> subsets = new ArrayList<>();

    public void PrintSubset(int[] set, int size) {
        int[] subset = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print(set[i] + " ");
            subset[i] = set[i];
        }
        System.out.println();
        subsets.add(subset);
    }

    public void Sum(int[] setVector, int[] tupletVector, int setSize, int tupletSize, int sum, int nodesCount, int targetSum) {
        if (targetSum == sum) {
            PrintSubset(tupletVector, tupletSize);
            Sum(setVector, tupletVector, setSize, tupletSize - 1, sum - setVector[nodesCount], nodesCount + 1, targetSum);
        } else {
            for (int i = nodesCount; i < setSize; i++) {
                tupletVector[tupletSize] = setVector[i];
                Sum(setVector, tupletVector, setSize, tupletSize + 1, sum + setVector[i], i + 1, targetSum);
            }
        }
    }

    public void GenerateSubsets(int[] setVector, int setSize, int targetSum) {
        int[] tupletVector = new int[setSize];
        int total = 0;

        Sort.Quick(setVector, 0, setSize - 1);

        for (int i = 0; i < setSize; i++)
            total += setVector[i];

        if (setVector[0] <= targetSum && total >= targetSum)
            Sum(setVector, tupletVector, setSize - 1, 0, 0, 0, targetSum);
    }
}
