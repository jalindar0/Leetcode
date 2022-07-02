class Solution {
    
    class Pair {
        int v,clr;
        Pair(int v,int clr){
            this.v = v;            
            this.clr = clr;
            
        }
        
    }
    
    public boolean isBipartite(int[][] graph) {
        int visited [] = new int [graph.length];
        
        for(int i = 0; i < graph.length; i++ ){
            if(visited[i] == 0){
                boolean ans = helper(graph,visited,i);
                if(ans == false){
                    return false;
                }            
            }   
        }
    
    return true;
    }
    
    public boolean helper(int [][] graph ,int [] visited,int v){
        
        ArrayDeque <Pair> q = new ArrayDeque<>();
        q.add(new Pair(v,1));
        
        while(q.size() > 0){
            Pair rem = q.remove();
            
            if(visited[rem.v] != 0){
                int oc = visited[rem.v];
                int nc = rem.clr;
                
                if(oc == nc){
                    continue;
                }else{
                    return false;
                }
            }
                   
            visited[rem.v] = rem.clr;
            for(int nbr : graph[rem.v]){
                if(visited[nbr] == 0){
                    q.add(new Pair(nbr,rem.clr* - 1));
                }
            }
            
        }
        return true;
        
    }
}