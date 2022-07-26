class Solution {
    public int partitionDisjoint(int[] nums) {
        
       int n = nums.length;
       int right[] = new int[n];
       int left[]  =  new int[n]; 
        
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
        //right array
     
        left[0] = nums[0];
        for(int i = 0; i < n-1 ;i++){
          if(nums[i] > max){
              max = nums[i];
              
          }
          left[i] = max;
          
          
      }
         
        right[n-1] = nums[n-1];
        for(int i = n-1; i >= 0 ;i--){
            if(nums[i] < min){
                min = nums[i];
                
            }
            right[i] = min;
       
      }
          
          
          
          
      
        
        int ans = -1;
       for(int i = 0; i < n-1 ;i++){
           if(left[i] <= right[i+1]){
               return i+1;
               
           }    
           
       } 
        
        return 1;
        
        
    }
}