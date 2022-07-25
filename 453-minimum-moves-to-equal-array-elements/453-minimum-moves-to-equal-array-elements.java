class Solution {
    public int minMoves(int[] nums) {
        int min =Integer.MAX_VALUE;
        
        for(int a : nums){
            min = Math.min(min,a);
            
        }
        
       // System.out.println(min);
        int res = 0;
        
        for(int a : nums){
            res +=( a - min);
             System.out.println(res);
        }
            
        return res;
        
    }
}