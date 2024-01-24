package mouse.labs.problem1;


import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> deviationMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer index = deviationMap.get(nums[i]);
            if (index != null) {
                return new int[]{index, i};
            }
            deviationMap.put(target - nums[i], i);
        }
        return null;
    }
}
