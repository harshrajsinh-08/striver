import java.util.*;

public class RecursiveBFS {
    static void bfs(Queue<Integer> queue, boolean[] visited, List<List<Integer>> adj) {
        if (queue.isEmpty()) return;

        int node = queue.poll();
        System.out.print(node + " ");

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                queue.offer(neighbor);
            }
        }

        bfs(queue, visited, adj);
    }

    

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(4).add(3);

        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;

        System.out.println("Recursive BFS:");
        bfs(queue, visited, adj);
    }
}