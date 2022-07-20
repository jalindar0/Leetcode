class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0 , max = -1;  
       
        
        if(arr.length == 0) return 0;
        
        for(int i = 0 ;  i < arr.length ; i++){
            max = Math.max(max, arr[i] );
           
            System.out.print(max +" ." );
           if(max == i){
               ans++;
           }
            System.out.println(max +" ."+max );
           
           
       } 
        return ans;
        
    }
}