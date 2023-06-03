package queue;

import org.w3c.dom.Node;

import java.util.Queue;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI
{
    /**
     * Constructs an empty queue.
     */

    private Node first;

    private Node last;

    private int size = 0;
    public NodeQueue(Node first, Node last, int size) {
        this.first = first;
        this.last = last;
        this.size = size;
    }

    {
        // TODO: Assignment 1: Implement this constructor...
    }

    @Override
    public void enqueue(Object element)
    {
        // TODO: Assignment 1: Implement this method...

        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public Object dequeue()
    {
        // TODO: Assignment 1: Implement this method...

        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public int size()
    {
        // TODO: Assignment 1: Implement this method...

        throw new UnsupportedOperationException("Not implemented");
    }

    @Override
    public boolean isEmpty()
    {
        // TODO: Assignment 1: Implement this method...

        throw new UnsupportedOperationException("Not implemented");
    }
}
