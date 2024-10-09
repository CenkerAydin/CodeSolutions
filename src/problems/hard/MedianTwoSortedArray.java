package problems.hard;

public class MedianTwoSortedArray {

    //Problem Linki -> https://leetcode.com/problems/median-of-two-sorted-arrays/description/

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int mergeArrLength = nums1.length + nums2.length;
        int i = 0, j = 0, k = 0;
        int[] mergeArray = new int[mergeArrLength];
        double median =0.0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                mergeArray[k++] = nums1[i++];
            }else{
                mergeArray[k++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            mergeArray[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mergeArray[k++] = nums2[j++];
        }

        if (mergeArrLength % 2 == 0) {
            median = (mergeArray[mergeArrLength / 2 - 1] + mergeArray[mergeArrLength / 2]) / 2.0;
        } else {
            median = mergeArray[mergeArrLength / 2];
        }


        return median;
    }
}
