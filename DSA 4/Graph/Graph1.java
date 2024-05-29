// create a graph using Adjecency list

import java.util.ArrayList;

public class Graph1{

    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d , int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void main(String args[]){

        // find graph on notebook

        int V=5;     // number of vertices

      //  in normal :- int arr[] = new arr[v]
      ArrayList<Edge>[] graph = new ArrayList[V];   // create a array named graph  which store  arraylist 
  
      for (int i = 0; i < V; i++) {             // creating empty arraylist in every index
        graph[i] = new ArrayList<Edge>();
    }

    // Now you can add edges to the graph array
    //0-vertex
    graph[0].add(new Edge(0, 1, 5));
    //1-vertex
    graph[1].add(new Edge(1, 0,5 ));
    graph[1].add(new Edge(1, 2, 1));
    graph[1].add(new Edge(1, 3, 3));
    //2->vertex
    graph[2].add(new Edge(2, 1, 1));
    graph[2].add(new Edge(2, 3, 1));
    graph[2].add(new Edge(2, 4, 2));

    graph[3].add(new Edge(3, 1, 3));
    graph[3].add(new Edge(3, 2, 1));

    graph[4].add(new Edge(4, 2, 2));

    // how to print neighbors of any vertex
    // neighbors of 2
    for(int i=0;i<graph[2].size();i++){
        Edge e= graph[2].get(i);   // access all edge one by one
        System.out.print(" 2->"+e.dest);
    }
    }
}