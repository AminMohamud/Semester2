package Opgave2;

public class LinkedBag<T> implements Bag<T> {

    private Node firstNode;

    private int numberOfEntries;

    private int maxSize;

    @Override
    public int getCurrentSize() {
        return numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return maxSize == numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

    @Override
    public boolean add(T newEntry) {

        if (!isFull()) {
            Node newNode = new Node();
            newNode.data = newEntry;
            newNode.next = firstNode;
            firstNode = newNode;
            numberOfEntries++;
            return true;
        }
        return false;
    }



    @Override
    public T remove() {
        return null;
    }

    @Override
    public boolean remove(T anEntry) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public int getFrequencyOf(T anEntry) {
        return 0;
    }

    @Override
    public boolean contains(T anEntry) {
        return false;
    }

    @Override
    public T[] toArray() {
        return null;
    }

    private class Node {

        private T data;

        private Node next;


    }
}
