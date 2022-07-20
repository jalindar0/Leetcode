class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        
        
        int s = -1, e = -1, res = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] >= left && nums[i] <= right){
                e = i ;
            }else if (nums[i] > right){
                e = s = i;
            }else{
                
            }
            
            res +=(e-s);
        }
        
        return res;
    }
}