package com.edu.umanizales.first_api.model;

import lombok.Getter;

@Getter
public class Node {
    // Getters y setters
    private int value;
    private Node left;
    private Node right;

    // Constructor
    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
