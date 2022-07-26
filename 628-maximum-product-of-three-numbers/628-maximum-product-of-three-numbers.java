class Solution {
    
//      public int maximumProduct(int[] nums) {
         
//          int n = nums.length;
//          if(nums.length == 3){
//              return nums[0]*nums[1]*nums[2];
//          }
         
//          Arrays.sort(nums);
         
//          return Math.max((nums[n-1]*nums[n-2]*nums[n-3]),(nums[0]*nums[1]*nums[n-1]));
         
         
         
         
         
//      }
    
    
    
    
    
    
    
    
    public int maximumProduct(int[] nums) {
        
        int mx1 = Integer.MIN_VALUE;
        int mx2 = Integer.MIN_VALUE;
        int mx3 = Integer.MIN_VALUE;
      
            //Negative Case
        int mn1 = Integer.MAX_VALUE;
        int mn2 = Integer.MAX_VALUE;
            
                     
        for (int num : nums) {
          // top 3 max
            if (num > mx1) {
                mx3 = mx2;
                mx2 = mx1;
                mx1 = num;
            } else if (num > mx2) {
                mx3 = mx2;
                mx2 = num;
            } else if (num > mx3) {
                mx3 = num;
            }

            // min top 2
            
            if (num < mn1) {
                mn2 = mn1;
                mn1 = num;
            } else if (num < mn2) {
                mn2 = num;
            }
        }
        return Math.max(mx1*mx2*mx3, mx1*mn1*mn2);
    }
        
    
}