package weightedGraph;

public class TestWeightedGraph {
	public static void main(String[] args) {
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
		
		int startingVertexB = 0;
		WeightedGraph.MST mstBoston = graph.getMinimumSpanningTree(startingVertexB);
		System.out.println("\nMinimum Spanning Tree MST starting from Boston(Vertex 0)");
		System.out.println();
		System.out.println("Total Weight of MST starting from Boston is " + mstBoston.getTotalWeight());
		
		int startingVertexC = 4;
		WeightedGraph.MST mstChicago = graph.getMinimumSpanningTree(startingVertexC);
		System.out.println("\nMinimum Spanning Tree MST starting from Chicago(Vertex 4)");
		System.out.println();
		System.out.println("Total Weight of MST starting from Chicago is " + mstChicago.getTotalWeight());
		
		int sourceVertexBoston = 0;
		WeightedGraph.ShortestPathTree sptBoston = graph.getShortestPath(sourceVertexBoston);
		System.out.println("\nShortest Paths starting from Boston");
		sptBoston.printAllPaths();
		
		int sourceVertexChicago = 2;
		WeightedGraph.ShortestPathTree sptChicago = graph.getShortestPath(sourceVertexChicago);
		System.out.println("\nShortest Paths starting from Chicago");
		sptChicago.printAllPaths();
	}
}
