package mouse.labs.problem27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        int last = nums.length;
        for (int i = 0; i < last; i++) {
            while (nums[i] == val && i < last) {
                nums[i] = nums[--last];
            }
        }
        return last;
    }
}
