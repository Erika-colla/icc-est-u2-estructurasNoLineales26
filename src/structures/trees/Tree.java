package structures.trees;

import models.Persona;
import structures.node.Node;

public class Tree<T extends Comparable<T>> {

    private Node<T> root;

    public Tree() {
        root = null;
    }

    public void insert(T value) {
        root = insertRecursive(root, value);
    }

    private Node<T> insertRecursive(Node<T> current, T value) {

        if (current == null) {
            return new Node<>(value);
        }

        if (value.compareTo(current.getValue()) < 0) {
            current.setLeft(insertRecursive(current.getLeft(), value));
        } 
        else if (value.compareTo(current.getValue()) > 0) {
            current.setRight(insertRecursive(current.getRight(), value));
        }

        return current;
    }

    public void inOrder() {
        inOrderRecursive(root);
        System.out.println();
    }

    private void inOrderRecursive(Node<T> node) {
        if (node != null) {
            inOrderRecursive(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrderRecursive(node.getRight());
        }
    }

    public T search(T value) {
        return searchRecursive(root, value);
    }

    public T searchRecursive(Node<T> root2, T value) {

        if (root2 == null) {
            return null;
        }

        int comp = value.compareTo(root2.getValue());
    
        if (comp == 0) {
            return root2.getValue();
        } 
        else if (comp < 0) {
            return searchRecursive(root2.getLeft(), value);
        } 
        else {
            return searchRecursive(root2.getRight(), value);
        }
    }

    public T searchByAge(int age) {
        return searchByAgeRecursive(root, age);
    }

    private T searchByAgeRecursive(Node<T> current, int age) {

        if (current == null) {
            return null;
        }

        Persona personaActual = (Persona) current.getValue();

        if (personaActual.getEdad() == age) {
            return current.getValue();
        }

        if (age < personaActual.getEdad()) {
            return searchByAgeRecursive(current.getLeft(), age);
        } else {
            return searchByAgeRecursive(current.getRight(), age);
        }
    }
}