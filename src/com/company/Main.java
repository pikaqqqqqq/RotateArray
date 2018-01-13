package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums2 = {1};
        int[] nums3 = {1, 2};
        rotate1(nums1, 3);
        rotate1(nums2, 1);
        rotate1(nums3, 2);
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < nums3.length; i++) {
            System.out.print(nums3[i] + " ");
        }

    }

    public static void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return;
        }
        if (k > nums.length)
            reversed(nums, 0, nums.length - 1);
        else {
            reversed(nums, 0, nums.length - 1);
            reversed(nums, 0, k - 1);
            reversed(nums, k, nums.length - 1);
        }
    }

    public static void reversed(int[] nums, int start, int end) {

        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate1(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int tmp;
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        for (int i = 0, j = k - 1; i < j; i++, j--) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }

        for (int i = k, j = nums.length - 1; i < j; i++, j--) {
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
