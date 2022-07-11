package com.daysofcodesummer;

public class DayOne {

    public static void main(String[] args) {

        int[] input = {3,4,5};
        int[] result = swapEnds(input);

        for (int item: result) {
            System.out.println(item);
        }
    }

    public static int[] swapEnds(int[] nums) {
        int[] modifiedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                modifiedArray[nums.length - 1] = nums[i];
            } else if (i == nums.length - 1) {
                modifiedArray[0] = nums[i];
            } else {
                modifiedArray[i] = nums[i];
            }
        }
        return modifiedArray;
    }
}
