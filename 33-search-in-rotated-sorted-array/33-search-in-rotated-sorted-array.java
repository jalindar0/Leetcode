class Solution {
    public int search(int[] nums, int target) {
        
        
        int a = 0;
        
        for(int i: nums){
            if(i == target){
                return a;
            }
            a++;
        }
        return -1;
    }
}