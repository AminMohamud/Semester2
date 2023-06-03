package Opg3;

import Opg1.Stack;

public class ArrayStack implements Stack {

    private int top;
    private int antal;


    private Object[] stack = new Object[6];

    private int count;

    public ArrayStack(int antal) {
        stack = new Object[antal];
    }

    @Override
    public void push(Object element) {

        if(count == 0) {
            stack[0] = element;
            count++;
        } else {
            stack[count + 1] = element;
            count++;
        }
    }

    @Override
    public Object pop() {
        count--;
        Object element = stack[count];
        stack[count] = null;
        return element;
    }

    @Override
    public Object peek() {
        return stack[count];
    }

    @Override
    public boolean isEmpty() {
        return stack[0] == null;
    }

    @Override
    public int size() {
        return count;
    }
}
