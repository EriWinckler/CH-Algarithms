package com.company.tree;

public class Node<T> {
    public T value;
    public Node<T> left;
    public Node<T> rigt;

    public Node(T value) {
        this.value = value;
    }
}
