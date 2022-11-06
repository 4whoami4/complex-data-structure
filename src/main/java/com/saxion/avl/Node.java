package com.saxion.avl;

public class Node<T> {
    public int key, height = 1;
    public T value;
    public Node<T> left, right;

    public Node(int key) {
        this.key = key;
    }

    public Node(int key, T value) {
        this.key = key;
        this.value = value;
    }
}
