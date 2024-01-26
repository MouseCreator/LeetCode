package mouse.labs.problem4;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int middle = nums1.length >>> 1;
        int middleValue = nums1[middle];
        int index = findIndexOf(nums2, middleValue);
        int medianIndex = middle + index;
        return 0.0;
    }

    private int findIndexOf(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        int mid;
        while (low < high) {
            mid = (high + low) >>> 1;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return high;
    }

}
