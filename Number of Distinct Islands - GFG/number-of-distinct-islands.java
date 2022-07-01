// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here

        int m = grid.length;
        int n = grid[0].length;
        boolean visited[][] = new boolean [m][n];
    
        HashSet ans = new HashSet();
        
        
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ; j++){
                if(visited[i][j] == false && grid[i][j] == 1){
                        
                    String path = helper(grid,visited,i,j,"X");
                    ans.add(path);
               
                       
                }
            }
            
        }
        
        return ans.size();
        
        
    }
    
    public String helper(int grid[][],boolean visited[][],int x,int y,String s){
     if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || visited[x][y] == true || grid[x][y] == 0){
           
         return "0";
     }
     
        visited[x][y] = true;
      
        
          String rd = helper(grid,visited,x+1,y,s+"R");
          String ld = helper(grid,visited,x-1,y,s+"L");
          String dd = helper(grid,visited,x,y+1,s+"D");
          String ud = helper(grid,visited,x,y-1,s+"U");
          return s+ ld+rd+dd+ud; 
       
        
        
        
    }
}