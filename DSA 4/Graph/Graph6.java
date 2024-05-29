// Cycle detection for directed graph using dfs
import java.util.ArrayList;
import java.util.Stack;

public class Graph6 {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
       
        graph[1].add(new Edge(1, 0));
      
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 0));
 
    }

    // Code for cycle detection
 public static boolean isCycle(ArrayList<Edge>[] graph){  // this function work as scroll down whole elements of graph
    boolean visited[]=new boolean[graph.length];          
    boolean stack[]=new boolean[graph.length];
    for(int i=0;i<graph.length;i++){
        if(!visited[i]){
            if(isCycleUtil(graph,i,visited,stack)){  // if isCycle util return true than I also return true
                return true;
            }
        }
    }
    return false;
 }
 public static boolean isCycleUtil(ArrayList<Edge>[] graph,int curr, boolean visited[], boolean stack[]){// actual work done by this util function
      visited[curr]=true;
      stack[curr]=true;
      for(int i=0;i<graph[curr].size();i++){ // for all neighbour
        Edge e=graph[curr].get(i);
        if(stack[e.dest]){   // neighbour already is in stack-> cycle
            return true;
        }
        if(!visited[e.dest] && isCycleUtil(graph, e.dest, visited, stack)){  // agar visited nahi hay, to kha visited ka bad cycle hai??
            return true;
        }
      }
      stack[curr]=false;
      return false;
 }
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
       System.out.println(isCycle(graph));
    }
}
