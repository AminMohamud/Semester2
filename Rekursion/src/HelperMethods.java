//package rekursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HelperMethods {

    public static int ligeTal(ArrayList<Integer> list) {
        return ligeTal(list, 0);
    }

    public static int sum1(ArrayList<Integer> list) {
        int result;
        if (list.size() == 0) {
            result = 0;
        } else {
            result = list.get(0);
            list.remove(0);
            result = result + sum(list);
        }
        return result;
    }

    public static int sum(ArrayList<Integer> list) {
        return sum(list, 0);
    }

    // Rekursiv hjælpemetode med de nødvendige parametre

    private static int sum(ArrayList<Integer> list, int index) {
        int result;
        if (index == list.size()) {
            result = 0;
        } else {
            result = list.get(index) + sum(list, index + 1);
        }
        return result;
    }


    //Find antallet af lige tal i en liste.
    private static int ligeTal(ArrayList<Integer> list, int index) {
        int result;

        if (index == list.size()) {
            result = 0;
        } else if (list.get(index) % 2 == 0) {
            result = 1 + ligeTal(list, index + 1);

        } else {
            result = ligeTal(list, index + 1);
        }
        return result;
    }

    // Rekursiv hjælpemetode med de nødvendige parametre
    private static int length(ArrayList<Integer> list, int index) {
        int result;

        if (index == list.size()) {
            result = 0;
        } else {
            result = 1 + length(list, index + 1);
        }
        return result;

    }

    public static boolean palindrom(String tekst) {
        int length = tekst.length();
        return isPalindrome(tekst,0,length-1);
    }

    private static boolean isPalindrome(String tekst, int start, int end) {
        if(start >= end) {
            return true;
        }
        if (tekst.charAt(start) != tekst.charAt(end)) {
            return false;
        }
        return isPalindrome(tekst, start,end-1);
    }

    //Lav en metode der kan afgøre om et tal findes i et array af heltal (en søgning). Det kan antages at
    //tallene i arrayet er sorteret i ikke aftagende orden og implementationen, skal være baseret på binær
    //søgning. Implementationen skal anvende rekursion, idet den rekursive metode, skal være en hjælpe
    //metode, så der ikke skal laves kopier af dele af arrayet i de rekursive kald.


    public static boolean findesTal(int [] arr, int target) {
        return findesTal(arr, target,0 ,arr.length-1 );
        }

    public static boolean findesTal(int [] arr, int target, int low, int high) {
        //Find midten
        int mid = low + ((high - low) /2);
        if(high < low) {
            return false;
        }

        if(arr[mid] == target) {
            return true;
        } else if (arr[mid] < target) {
            return findesTal(arr, target, mid+1, high);
        } else {
           return  findesTal(arr,target,low,mid -1);
        }

    }





    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(10);
        list.add(17);
        list.add(4);
        list.add(3);
        list.add(45);
        list.add(29);
        System.out.println(list);
        System.out.println("sum: " + sum(list));
        //System.out.println("length: " + length(list));
        System.out.println("Antal ligetal: " + ligeTal(list));

        System.out.println(list);
        System.out.println(palindrom("abba"));
    }

}
