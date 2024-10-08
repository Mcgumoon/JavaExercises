package assignment7;

public class TestUnweightedGraph {
	public static void main(String[] args) {
        // Instantiate UnweightedGraph object
        UnweightedGraph<Integer> graph = new UnweightedGraph<>();

        // Add vertices
        for (int i = 0; i < 12; i++) {
            graph.addVertex(i);
        }

        // Add edges
        graph.addEdge(1, 0);
        graph.addEdge(2, 0);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 8);
        graph.addEdge(8, 5);
        graph.addEdge(5, 9);
        graph.addEdge(9, 10);
        graph.addEdge(10, 11);

        // Perform DFS starting from Boston (vertex 0)
        System.out.println("DFS starting from Boston:");
        UnweightedGraph.SearchTree dfsBoston = graph.dfs(0);
        dfsBoston.printTree();

        // Perform BFS starting from Boston (vertex 0)
        System.out.println("\nBFS starting from Boston:");
        UnweightedGraph.SearchTree bfsBoston = graph.bfs(0);
        bfsBoston.printTree();

        // Perform DFS starting from Chicago (vertex 2)
        System.out.println("\nDFS starting from Chicago:");
        UnweightedGraph.SearchTree dfsChicago = graph.dfs(2);
        dfsChicago.printTree();

        // Perform BFS starting from Chicago (vertex 2)
        System.out.println("\nBFS starting from Chicago:");
        UnweightedGraph.SearchTree bfsChicago = graph.bfs(2);
        bfsChicago.printTree();
	}
}
