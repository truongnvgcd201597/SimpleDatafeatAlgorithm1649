package src;

import java.util.EmptyStackException;

public class Stack {
    private static class Node {
        private String data;
        private Node next;

        private Node(String data) {
            this.data = data;
        }
    }

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public String peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public void push(String data) {
        Node node = new Node(data);
        node.next = top;
        top = node;
    }

    public String pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        String data = top.data;
        top = top.next;
        return data;
    }

    public void print() {
        Node current = top;
        while (current != null) {
            System.out.println("Stack element: " + current.data);
            current = current.next;
        }
        System.out.println();
    }

    public void printTraverse() {
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Hello");
        stack.push("World");
        stack.push("!");
        stack.print();
        stack.printTraverse();
    }
}
