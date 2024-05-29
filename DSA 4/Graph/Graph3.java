// import java.util.*;
// // conected components
// // function for traverse multicomponent graph using helper function
// this is only until dfs function
// public class Graph3 {
//     public static void bfs(ArrayList<Edge>[] graph) {
//         boolean visited[] = new boolean[graph.length];
//         for (int i = 0; i < graph.length; i++) {
//             if (!visited[i]) {
//                 bfsUtil(graph, visited);
//             }
//         }
//     }

//     public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] visited) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(0); // source = 0

//         while (!q.isEmpty()) {
//             int curr = q.remove();

//             if (!visited[curr]) { // if not visited
//                 System.out.print(curr + " "); // print
//                 visited[curr] = true; // now visit
//                 for (int i = 0; i < graph[curr].size(); i++) { // add neighbor
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     public static void main(String args[]) {
        
//     }
// }
