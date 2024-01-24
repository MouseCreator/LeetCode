package mouse.labs.problem35;

public class RemoveElement {
    public int searchInsert(int[] nums, int target) {
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
