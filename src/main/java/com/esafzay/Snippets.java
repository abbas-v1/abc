package com.esafzay;

import java.util.Arrays;
import java.util.List;

public class Snippets {

    public static void main(String[] args) {
        sortIntervals();
    }

    private static void sortIntervals() {
        int[][] intervals = {{2,4},{2,3}, {1,2}, {7,9}, {4,7}};

        Arrays.sort(intervals, (a, b)-> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }

        System.out.println(Arrays.deepToString(intervals));
    }

    int[] answerQueries(List<Integer> queries, int N) {
        return new int[0];
    }

    private static void testBinarySearch() {
        System.out.println(binarySearch(new int[]{-1,0,3,5,9,12}, 9));
        System.out.println(binarySearch(new int[]{5}, 5));
    }

    private static int binarySearch(int[] nums, int target) {

        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {

            int mid = (lo + hi) / 2;

            if (target == nums[mid]) {
                return mid;

            } else if (target < nums[mid]) {
                hi = mid - 1;

            } else {
                lo = mid + 1;
            }
        }

        return -1;
    }
}
