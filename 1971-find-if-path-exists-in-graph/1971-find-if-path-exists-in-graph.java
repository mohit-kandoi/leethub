class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dstn) {
        
        
        
        ArrayList<Edge> graph[] = new ArrayList[n];
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }
        
        for(int i=0; i<edges.length; i++){
            
            int v = edges[i][0];
            int ngh = edges[i][1];
            graph[v].add(new Edge(v,ngh));
            graph[ngh].add(new Edge(ngh,v));
            
        }
        
        boolean[] visited = new boolean[n];
        return solve(graph, src, dstn, visited);
        
    }
    
    public boolean solve(ArrayList<Edge> graph[], int src, int dstn, boolean[] visited){
        
        if(src == dstn) return true;
        
        visited[src] = true;
        
        for(int i=0; i<graph[src].size();i++){
            Edge edge = graph[src].get(i);
            int v = edge.v;
            int ngh = edge.ngh;
            if(visited[ngh] == false){
                boolean check = solve(graph,ngh,dstn,visited);
                if(check) return true;
            }
        }
        return false;
        
    }
    public class Edge{
            int v;
            int ngh;
            Edge(int v, int ngh){
                this.v = v;
                this.ngh = ngh;
            }
        }
}