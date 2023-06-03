package Opg2;

import java.util.NoSuchElementException;

public class Nodestack implements Stack {

    private Node first;

    private int count;


    public Nodestack() {
        first = null;
    }

    @Override
    public void push(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        count++;
        }

    @Override
    public Object pop() {
        if (first == null) {
            throw new NoSuchElementException();
        }
        Object element = first.data;
        first = first.next;
        count--;
        return element;
    }

    @Override
    public Object peek() {
        Node temp = first;
        if(temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return count;
    }

    class Node {
    public Object data;
    public Node next;
    }
}

