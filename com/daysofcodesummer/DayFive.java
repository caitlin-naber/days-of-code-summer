package com.daysofcodesummer;

public class DayFive {
    public static void main(String[] args) {

        int start = 5;
        int end = 10;

        int[] result = fizzArray3(start, end);

        for(int item: result){
            System.out.println(item);
        }
    }

/*
Exercise 5: fizzArray3
Create an integer array method called fizzArray3  that takes in two integers "start" and "end"
Given start and end numbers, return a new array containing the sequence of integers from start up to but
not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal
to the start number. Note that a length-0 array is valid.
fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]
*/

    public static int[] fizzArray3(int start, int end) {
      int[] newArray = new int[];
    }


}
