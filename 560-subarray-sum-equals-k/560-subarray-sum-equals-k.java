// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            sum+=nums[i];
            if(map.containsKey(sum - k)){
                count += map.get(sum-k);
            }
            if(!map.containsKey(sum)){
                map.put(sum, 0);
            }
            map.put(sum, map.get(sum)+1);
        }
        
        return count;
        
    }
}