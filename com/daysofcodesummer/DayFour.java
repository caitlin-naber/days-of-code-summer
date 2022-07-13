package com.daysofcodesummer;

public class DayFour {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {1,2};

        int result = start1(a, b);

        System.out.println(result);
    }

/*
Exercise 4: start1
Create an integer method called start1 that takes in two integer arrays "a" and "b".
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
*/

    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a[0] == 1 && b[0] == 1) {
            count = 2;
        } else if (a[0] == 1 || b[0] ==1) {
            count = 1;
        }
        return count;
    }

}
