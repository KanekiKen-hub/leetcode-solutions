Time complexity is o(n) and space complexity is o(1)

class Solution {
    public int thirdMax(int[] nums) {

        long largest = Long.MIN_VALUE;
        long second_largest = Long.MIN_VALUE;
        long third_largest = Long.MIN_VALUE;

        for(int num : nums){
            
             if(num == largest || num == second_largest || num == third_largest)
                continue;

            if(num > largest){
                third_largest = second_largest;
                second_largest = largest;
                largest = num;
            }
            else if(num > second_largest){
                third_largest = second_largest;
                second_largest = num;
            }
            else if(num > third_largest){
                third_largest = num;
            }
        }

        if(third_largest == Long.MIN_VALUE)
            return (int)largest;

        return (int)third_largest;
    }
}
