package weightedGraph;

public class WeightedGraphTest {
	public static void testWeightedGraph() {
		WeightedGraph<Integer> graph = new WeightedGraph<>();
		
		for(int index = 0; index < 12; index ++) {
			graph.addVertex(index);
		}
		
		graph.addEdge(1, 0, 2.0);
		graph.addEdge(2, 0, 3.0);
		graph.addEdge(0, 3, 4.5);
		graph.addEdge(3, 4, 1.2);
		graph.addEdge(4, 6, 5.0);
		graph.addEdge(6, 7, 2.8);
		graph.addEdge(7, 8, 3.3);
		graph.addEdge(8, 5, 2.1);
		graph.addEdge(5, 9, 4.7);
		graph.addEdge(9, 10, 3.9);
		graph.addEdge(10, 11, 1.8);
		
		System.out.println("Weighted edges: ");
		graph.printWeightedEdges();
		
		WeightedGraph.MST mst = graph.getMinimumSpanningTree();
		System.out.println("\nMinimum Spanning Tree MST: ");
		mst.printTree();
		System.out.println("Total weight of MST: " + mst.getTotalWeight());
		
		int sourceVertex = 0;
		WeightedGraph.ShortestPathTree spt = graph.getShortestPath(sourceVertex);
		System.out.println("\nShortest Paths from vertex " + sourceVertex + ":");
		spt.printAllPaths();
	}
}
