import java.util.*;

public class recursiveDFS {
    static void dfs(int node, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5; // number of vertices
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        // Sample undirected graph
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);zx
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(4).add(3);

        boolean[] visited = new boolean[V];
        System.out.println("Recursive DFS:");
        dfs(0, visited, adj);
    }
}