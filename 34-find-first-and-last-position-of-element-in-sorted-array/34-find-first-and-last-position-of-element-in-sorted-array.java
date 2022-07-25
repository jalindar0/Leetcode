class Solution {
    public int[] searchRange(int[] nums, int target) {
      //  int [] ans = new int[2];
        int p1 = -1;
        int p2 = -1;
        
        for(int i = 0; i < nums.length ; i++){
            
            if(nums[i] == target && p1 == -1 && p2 == -1 ){
                p1 = i;
                p2 = i;
            }else if(nums[i] == target){
                p2++;
            }
            
            
        }
       int [] ans = {p1,p2};
        
        return ans;
    }
}