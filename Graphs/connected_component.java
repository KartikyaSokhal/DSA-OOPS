package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class connected_component {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {

        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        // 1
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        // 2
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        // 3
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        // 4
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        // 5
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        // 6
        graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];
        for (int i=0;i< graph.length;i++){
            if (!visited[i]){
                bfsutil(graph,visited);;
            }
        }
    }
    public static void bfsutil(ArrayList<Edge>[] graph, boolean[] visited){  // O(V+E)
        Queue<Integer> q = new LinkedList<>();
        q.add(0); // sourse = 0;
        while(!q.isEmpty()){
            int curr = q.remove();
            if (!visited[curr]){
                System.out.print(curr+" ");
                visited[curr] = true;
                for (int j=0;j<graph[curr].size();j++){
                    Edge e = graph[curr].get(j);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];
        for (int i=0;i< graph.length;i++){
            if (!visited[i]){
                dfsutil(graph,i,visited);;
            }
        }
    }
    public static void dfsutil(ArrayList<Edge>[] graph, int curr, boolean[] visited) {

        System.out.print(curr+" ");
        visited[curr] = true;

        for (int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]){
                dfsutil(graph,e.dest,visited);
            }
        }
    }

    public static void main(String[] args) {

        int V = 7;

        ArrayList<Edge>[] graph = new ArrayList[V];

        createGraph(graph);

        // Print Graph
//        for(int i = 0; i < V; i++) {
//            System.out.print(i + " -> ");
//
//            for(Edge e : graph[i]) {
//                System.out.print(e.dest + " ");
//            }
//
//            System.out.println();
//        }
        bfs(graph);
    }
}
