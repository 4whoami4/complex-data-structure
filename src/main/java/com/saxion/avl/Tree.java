package com.saxion.avl;

import java.util.ArrayList;
import java.util.List;

public class Tree<T> {
    public Node<T> root;

    private int height(Node<T> N) {
        if (N == null) return 0;
        return N.height;
    }

    private Node<T> RightRotate(Node<T> y) {
        Node<T> x = y.left;
        Node<T> T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private Node<T> LeftRotate(Node<T> x) {
        Node<T> y = x.right;
        Node<T> T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    private int GetBalance(Node<T> N) {
        if (N == null) return 0;
        return height(N.left) - height(N.right);
    }

    public Node<T> Insert(Node<T> node, int key, int height, T value) {
        if (node == null)
            return (new Node<>(key, height, value));

        if (key < node.key)
            node.left = Insert(node.left, key, height, value);
        else if (key > node.key)
            node.right = Insert(node.right, key, height, value);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = GetBalance(node);

        if (balance > 1 && key < node.left.key)
            return RightRotate(node);

        if (balance < -1 && key > node.right.key)
            return LeftRotate(node);

        if (balance > 1 && key > node.left.key) {
            node.left = LeftRotate(node.left);
            return RightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = RightRotate(node.right);
            return LeftRotate(node);
        }

        return node;
    }

    public List<Integer> PreOrder(Node<T> node) {
        List<Integer> result = new ArrayList<>();
        if (node == null) return result;

        result.add(node.key);

        result.addAll(PreOrder(node.left));
        result.addAll(PreOrder(node.right));

        return result;
    }

    public Node<T> Search(Node<T> root, int key) {
        if (root == null)
            return null;
        else if (root.key == key)
            return root;
        else if (root.key > key)
            return Search(root.left, key);
        return Search(root.right, key);
    }
}
