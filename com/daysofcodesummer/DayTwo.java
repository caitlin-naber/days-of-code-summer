package com.daysofcodesummer;

public class DayTwo {

    public static void main(String[] args) {

        int[] nums = {3, 1, 4, 5};
        boolean result = has12(nums);

        System.out.println(result);
    }

/*
Exercise 2: has12
Create a boolean method called has12 that takes in an integer array "nums". Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
For example:
has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
*/

    public static boolean has12(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                for (int k = i; k < nums.length; k++) {
                    if (nums[k] == 2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
