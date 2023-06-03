package Opg3;

public class main {
    public static void main(String[] args) {

    }

    public static boolean checkParantheses(String s) {
        ArrayStack arrayStack = new ArrayStack(20);
        for (int i = 0; i < arrayStack.size() ; i++) {
            char x = s.charAt(i);

            if(x == '(' || x == '[' || x == '{') {
                arrayStack.push(x);

            } else if (x == ']') {

            }

        }


    }
}
