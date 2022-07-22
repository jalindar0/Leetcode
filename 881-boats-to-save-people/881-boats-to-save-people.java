class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int ans = 0;
        
        Arrays.sort(people);
        
        int l =0;
        int r = people.length-1;
        int val;
        
        while(l < r){
            
         val  = people[l]+ people[r];
            
            if(val <= limit){
                l++;
                r--;
                ans++;
                
            }else{
                r--;
                ans++;
            }
            
        }
        
        if(l == r){
            ans= ans+1;
        }
        return ans;
    }
}