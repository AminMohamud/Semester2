import java.util.ArrayList;
import java.util.List;

public class Rekursion {
    public static void main(String[] args) {

    }

    public static int factorial(int n) {
        int result = 0;

        if (n == 0) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }


    public static int power(int n, int p) {
        int result = 0;

        if (p == 0) {
            result = 1;
        } else {
            result = n * power(n, p - 1);
        }
        return result;
    }

    public static int power2(int n, int p) {
        int result = 0;

        if (p == 0) {
            result = 1;
        } else if (p % 2 != 0) {
            result = n * power2(n, p - 1);
        } else {
            result = power2(n * n, p / 2);
        }
        return result;
    }

    public static int product(int a, int b) {
        int result = 0;

        if (a == 0) {
            result = 0;
        } else {
            result = b + product(a - 1, b);
        }
        return result;
    }

    public static int productRus(int a, int b) {
        int result = 0;

        if (a == 0) {
            result = 0;
        } else if (a % 2 != 0) {
            result = b + productRus(a - 1, b);
        } else {
            result = productRus(a / 2, 2 * b);
        }
        return result;
    }

    public static String reverse(String s) {

        if (s.length() == 1) {
            return s;
        } else {
            return s.substring(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
        }
    }

    public static int Sfd(int a, int b) {
        if (b <= a && a % b == 0) {
            return b;
        } else if (a < b) {
            return Sfd(b, a);
        } else {
            return Sfd(b, a % b);
        }
    }

    public static int countDelStreng(List<String> List, String sub) {

        int count = 0;

        for (String streng : List) {
            for (int index = 0; index < streng.length(); index++) {
                if (index + sub.length() < streng.length()) {
                    if (streng.substring(index, index + sub.length()).equals(sub)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}




