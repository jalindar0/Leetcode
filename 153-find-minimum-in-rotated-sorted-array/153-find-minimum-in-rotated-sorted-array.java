class Solution {
    public int findMin(int[] nums) {
        int ans = nums[0];
        for(int i : nums){
            ans = Math.min(ans,i);
            
        }
        
        return ans;
        
    }
}