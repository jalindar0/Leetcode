class Solution {
    public int minMoves2(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
      
        
        int v = nums[l/2];
        int ans = 0;
        for(int i = 0 ; i < l ; i++){
            ans += Math.abs(v - nums[i]);
            
        }
        
        return ans;
    }
}