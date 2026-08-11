Time complexity is o(n) and space is o(n)

  class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet<>();

        for(int num :nums){
            if(list.contains(num)){
                return true;
            }
            else{
                list.add(num);
            }
        }

        return false;
    }
}
