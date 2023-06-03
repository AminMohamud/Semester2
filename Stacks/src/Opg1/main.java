package Opg1;

import Opg1.ArrayStack;

public class main {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);

        System.out.println(arrayStack.peek());


    }
}
