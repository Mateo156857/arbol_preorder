package com.edu.umanizales.first_api.service;

import com.edu.umanizales.first_api.model.Node;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TreeService {
    private Node root;

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.getValue()) {
            node.setLeft(addRecursive(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(addRecursive(node.getRight(), value));
        }

        return node;
    }

    public List<Integer> preorder() {
        List<Integer> values = new ArrayList<>();
        preorderRecursive(root, values);
        return values;
    }

    private void preorderRecursive(Node node, List<Integer> values) {
        if (node == null) {
            return;
        }
        values.add(node.getValue());  // Procesar el nodo
        preorderRecursive(node.getLeft(), values);  // Recorrer el subárbol izquierdo
        preorderRecursive(node.getRight(), values);  // Recorrer el subárbol derecho
    }
}