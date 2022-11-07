package com.saxion.avl;

public class Node<T> {
    public int key, height;
    public T value;
    public Node<T> left, right;

    public Node(int key) {
        this.key = key;
    }

    public Node(int key, int height, T value) {
        this.key = key;
        this.value = value;
        this.height = height;
    }
}
