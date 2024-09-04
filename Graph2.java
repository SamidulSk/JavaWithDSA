// BFS

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph2 {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w; // we can remove this weight part from code
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) { // parameter is a array* which type is arraylist
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        // find graph on notebook
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    }
 
    // write function for BFS O(V+E)
    public static void bfs(ArrayList<Edge>[] graph) { // parameter is a arraylist
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0); // source =0

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) { // if not visited

                System.out.print(curr + " "); // print
                visited[curr] = true; // now visit
                for (int i = 0; i < graph[curr].size(); i++) { // add neighbour
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    // DFS
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean visited[]){
        // visit curr
        System.out.print(curr+" ");
        visited[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(!visited[e.dest]){
                dfs(graph, e.dest, visited);
            }
        }
    }
    // hasPath??
    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean visited[]){
        if(src==dest){
            return true;
        }
        visited[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e =graph[src].get(i);
            //e.dest = my neighbor
            if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // graph on notebook
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
        System.out.println("\n*********************");
        dfs(graph, 0, new boolean[V]);

        System.out.println(hasPath(graph, 0, 9, new boolean[V]));
    }
}