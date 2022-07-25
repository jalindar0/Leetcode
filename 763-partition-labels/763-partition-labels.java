class Solution {
    public List<Integer> partitionLabels(String s) {
        
        int  [] map = new int[26];
         Arrays.fill(map,-1);
        
        
        for(int i = 0; i < s.length(); i++){
            char ch  = s.charAt(i);
            map[ch -'a']= i;
            
        }
        
        int x = 0, y = 0;
        
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            y = Math.max(y,map[ch - 'a']);
            
            
            if(i == y){
                int len = y-x+1;
                res.add(len);
                x=y=i+1;
            }
        }
        
        return res;
        
        
        
        
    }
}