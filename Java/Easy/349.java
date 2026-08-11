Time complexity is o(n+m) and space complexity is o(n)

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

      for(int num : nums1) {
            set.add(num);
        }

        HashSet<Integer> result = new HashSet<>();

    for(int num : nums2) {
            if(set.contains(num)) {
                result.add(num);
            }
        }

         int[] ans = new int[result.size()];

        int index = 0;

        for(int num : result) {
            ans[index++] = num;
        }

        return ans;
    }
}
