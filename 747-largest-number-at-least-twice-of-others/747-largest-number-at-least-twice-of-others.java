class Solution {
    public int dominantIndex(int[] nums) {
        
        int max = 0, smax =0, ans = -1;
        for(int i=0;i<nums.length;i++){
            if(max<=nums[i]){
                smax = max;
                max = nums[i];
                ans = i;
            }else if(smax<nums[i]){
                smax = nums[i];
            }
        }
        if((smax*2)<=max) return ans;
        return -1;
        
    }
}