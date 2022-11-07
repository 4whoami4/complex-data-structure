package com.saxion;

public class Backtrack {
public static int Grid(int x, int y, int f, int n) {
    if (x == f && y == f) return 1;
    if (x <= f && y <= n)
        return Grid(x + 1, y, f, n) + Grid(x, y + 1, f, n);
    return 0;
}
}
