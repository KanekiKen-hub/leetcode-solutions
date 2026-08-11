Time complexity is o(n*log n) and space complexity is 0(1)

import java.util.Arrays;

class Solution {
    public int missingInteger(int[] nums) {

        int sum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }
        Arrays.sort(nums);

        while (Arrays.binarySearch(nums, sum) >= 0) {
            sum++;
        }
    return sum;
    }
}
