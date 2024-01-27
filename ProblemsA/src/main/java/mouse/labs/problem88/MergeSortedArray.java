package mouse.labs.problem88;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] buffer = new int[m+n];
        int i = 0;
        int j = 0;
        int current = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                buffer[current++] = nums1[i++];
            } else {
                buffer[current++] = nums2[j++];
            }
        }
        while (i < m) {
            buffer[current++] = nums1[i++];
        }
        while (j < n) {
            buffer[current++] = nums2[j++];
        }
        System.arraycopy(buffer, 0, nums1, 0, current);
    }
}
