package mouse.labs.problem26;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int toInsert = 0;
        int toCompare = 1;
        int currentElement = nums[0];
        while (toCompare < nums.length) {
            nums[toInsert] = currentElement;
            while (nums[toCompare] == currentElement) {
                toCompare++;
                if (toCompare == nums.length) {
                    return toInsert + 1;
                }
            }
            currentElement = nums[toCompare];
            toInsert++;
        }
        return 1;
    }
}
