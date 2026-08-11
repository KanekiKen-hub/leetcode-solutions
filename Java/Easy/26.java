
Time complexity is o(n) and space complexity is o(1)



class Solution {
    public int removeDuplicates(int[] nums) {

        int j = 0;  
        for (int i = 1; i < nums.length; i++) {  
          if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }  return j + 1;
    }


}

