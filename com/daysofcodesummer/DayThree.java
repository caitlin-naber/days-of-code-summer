package com.daysofcodesummer;

public class DayThree {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;

        int result = greenTicket(a, b, c);

        System.out.println(result);
    }

/*
Exercise 3: greenTicket
Create an integer method called greenTicket that takes in three integers, "a". "b", and "c"
You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other,  the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the  result is 10.
greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
*/

    public static int greenTicket(int a, int b, int c) {
        int result = 0;
        if (a != b && a != c && b != c) {
            result = 0;
        } else if (a == b && a == c) {
            result = 20;
        } else if (a == b || a == c || b == c) {
            result = 10;
        }
        return result;
    }

}
