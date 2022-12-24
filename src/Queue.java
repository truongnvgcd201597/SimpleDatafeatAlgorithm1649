package src;

import java.util.NoSuchElementException;

public class Queue {
    private static class Node {
        private String data;
        private Node next;

        private Node(String data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public String peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public void add(String data) {
        Node node = new Node(data);
        if (tail != null) {
            tail.next = node;
        }
        tail = node;
        if (head == null) {
            head = node;
        }
    }

    public String remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        String data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println("Element: " + current.data);
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add("Hello");
        queue.add("World");
        queue.add("!");
        queue.print();
    }
}
