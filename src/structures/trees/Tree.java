package structures.trees;

import structures.node.Node;

public class Tree<T extends Comparable<T>> {

    private Node<T> root;
    private int size;

    public Tree() {
        root = null;
        size = 0;
    }

    public void insert(T value) {
        root = insertRecursive(root, value);
        size++;
    }

    protected Node<T> insertRecursive(Node<T> current, T value) {
        if (current == null) {
            return new Node<>(value);
        }

        if (value.compareTo(current.getValue()) < 0) {
            current.setLeft(insertRecursive(current.getLeft(), value));
        } else if (value.compareTo(current.getValue()) > 0) {
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

    public void preOrder() {
        preOrderRecursive(root);
        System.out.println();
    }

    private void preOrderRecursive(Node<T> node) {
        if (node != null) {
            System.out.print(node.getValue() + " ");
            preOrderRecursive(node.getLeft());
            preOrderRecursive(node.getRight());
        }
    }

    public void postOrder() {
        postOrderRecursive(root);
        System.out.println();
    }

    private void postOrderRecursive(Node<T> node) {
        if (node != null) {
            postOrderRecursive(node.getLeft());
            postOrderRecursive(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }
}