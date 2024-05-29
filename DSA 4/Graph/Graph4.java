// Cycle detection for undirected graph-DFS
import java.util.ArrayList;

public class Graph4 {

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
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    // Code for cycle detection
    public static boolean detectCycle(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (detectCycleUtil(graph, visited, i, -1)) {
                    return true; // Cycle exists in one of the parts
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // Case 3: If the neighbour is not visited
            if (!visited[e.dest]) {
                if (detectCycleUtil(graph, visited, e.dest, curr))
                    return true; // Cycle exists
            }
            // Case 1: If the destination vertex/neighbour is visited and not the parent of the
            // current vertex
            else if (visited[e.dest] && e.dest != parent) {
                return true; // Cycle exists
            }
            // Case 2: If the destination vertex is visited and is the parent of the current
            // vertex, do nothing, continue
        }
        return false; // No cycle found in the current part
    }

    public static void main(String[] args) {
        // graph image is in notebook
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
