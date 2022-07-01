class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean [m][n];
        int ans = 0;
        
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(i == 0 || j == 0 || i == grid.length-1 || j == grid[0].length-1){
                    if(visited[i][j] == false && grid[i][j] == 1){
                        helper(grid,visited,i,j);
                    }     
                   }
            }
            
        }
        
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(grid[i][j] ==1 && visited[i][j] ==false){
                    ans++;
                }
                
            }
        }
        
        return ans;
        
        
    }
    
    public void helper(int grid[][],boolean visited[][],int x,int y){
     if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || visited[x][y] == true || grid[x][y] == 0){
         return;
     }
     
        visited[x][y] = true;
        System.out.println(x+" "+y);
        
          helper(grid,visited,x+1,y);
          helper(grid,visited,x-1,y);
          helper(grid,visited,x,y+1);
          helper(grid,visited,x,y-1);
        
        
        
    }
}