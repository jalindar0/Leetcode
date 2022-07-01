class Solution {
    
    class Pair{
        int x,y,lev;
        
        Pair(int x,int y,int lev){
            this.x = x;
            this.y = y;
            this.lev = lev;
            
        }
    }
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        int ans = 0;
        ArrayDeque <Pair> q = new ArrayDeque<>();
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        
        for(int i = 0; i < grid.length ; i++){
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j] == 2){
                    q.add(new  Pair(i,j,0));
                }else if (grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        
        while(q.size() > 0){
            Pair rem = q.remove();
            
            if(visited[rem.x][rem.y] == true ){
                continue;
            }   
            visited[rem.x][rem.y] = true;
            if(grid[rem.x][rem.y] == 1)
                fresh--;
            
            if(ans < rem.lev){
                ans = rem.lev;
            }
            
            addNbr(grid,rem.x+1,rem.y,rem.lev+1,visited,q);
            addNbr(grid,rem.x,rem.y+1,rem.lev+1,visited,q);
            addNbr(grid,rem.x,rem.y-1,rem.lev+1,visited,q);                                             addNbr(grid,rem.x-1,rem.y,rem.lev+1,visited,q);
            
            
            
        }
        
        
        if(fresh == 0){
            return ans;
        }else
            return -1;
        
        
    }
                          
    public void addNbr(int [][] grid,int x,int y,int level,boolean[][] visited,ArrayDeque <Pair> q){
       if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || visited[x][y] == true || grid[x][y] == 0){
           return ;
       } 
        
        q.add(new Pair(x,y,level));
        
    }                      
}