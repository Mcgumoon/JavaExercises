package assignment7;

import java.util.Arrays;
import assignment7.UnweightedGraph.SearchTree;

//import java.util.List;
//import java.util.ArrayList;

import java.util.List;

public class UnweightedGraphTest {
	public static void testGraphConstruction() {
		System.out.println("Test graph construction using arrays");
		
		System.out.println("Constructor with vertices and edges: ");
		Integer[] vertices = {0, 1, 2, 3};
		int[][] edges = {{0,1}, {0,2}, {1,3}, {2,3}};
		UnweightedGraph<Integer> graph = new UnweightedGraph<>(vertices, edges);
		graph.printEdges();
		
		System.out.println("Constructor with vertices and edges using lists: ");
		List<Integer> verticesList = Arrays.asList(0, 1, 2, 3);
		List<Edge> edgesList = Arrays.asList(new Edge(0,1), new Edge(0,2), new Edge(1,3), new Edge(2,3));
		UnweightedGraph<Integer> graph2 = new UnweightedGraph<>(verticesList, edgesList);
		graph2.printEdges();
		
		System.out.println("Constructor with edge List and number of vertices: ");
		UnweightedGraph<Integer> graph3 = new UnweightedGraph<>(edgesList, 4);
		graph3.printEdges();
		
		System.out.println("Constructor with edges array and number of vetices: ");
		UnweightedGraph<Integer> graph4 = new UnweightedGraph<>(edges, 4);
		graph4.printEdges();
		
		System.out.println("End of Graph Constructor method");
	}
	
	public static void testAddingVerticesEdges(){
		UnweightedGraph<Integer> graph = new UnweightedGraph<>();
		
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		
		assert graph.getSize() == 3;
		
		List<Integer> vertices = graph.getVertices();
		assert vertices.size() == 3;
		assert vertices.contains(0);
		assert vertices.contains(1);
		assert vertices.contains(2);
		
		List<Integer> neighbor0 = graph.getNeighbors(0);
		assert neighbor0.size() == 2;
		assert neighbor0.contains(1);
		assert neighbor0.contains(2);
		
		List<Integer> neighbor1 = graph.getNeighbors(1);
		assert neighbor1.size() == 1;
		assert neighbor1.contains(2);
		
		List<Integer> neighbor2 = graph.getNeighbors(2);
		assert neighbor2.isEmpty();
		
		System.out.println("Test for adding vertices and edges complete");
	}
	
	public static void testDFS() {
		UnweightedGraph<Integer> graph = new UnweightedGraph<>();
		
		for(int index = 0; index < 6; index++) {
			graph.addVertex(index);
		}
		
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(1,3);
		graph.addEdge(1,4);
		graph.addEdge(2,5);
		
		UnweightedGraph.SearchTree searchTree = graph.dfs(0);
		
		System.out.println("DFS Search Order: ");
		List<Integer> searchOrder = searchTree.getSearchOrder();
		for(Integer vertex : searchOrder) {
			System.out.print(vertex + " ");
		}
		
		System.out.println();
		
		System.out.println("Parent Array:");
		int[] parentArray = searchTree.parent;
		for(int index = 0; index < parentArray.length; index++) {
			System.out.println("Parent of vertex " + index + " : " + parentArray[index]);
		}
		
		System.out.println("Path from vertex 5 to root:");
		List<Integer> path = searchTree.getPath(5);
		for(Integer vertex : path) {
			System.out.print(vertex + " ");
		}
		System.out.println();
	}
	
	public static void testBFS() {
		UnweightedGraph<Integer> graph = new UnweightedGraph<>();
		
		graph.addVertex(0);
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addEdge(0,1);
		graph.addEdge(0,2);
		graph.addEdge(1,3);
		
		UnweightedGraph.SearchTree bfsTree = graph.bfs(0);
		
		System.out.println("BFS search order: " + bfsTree.getSearchOrder());
		System.out.println("BFS parent Array: " + arrayToString(bfsTree.parent));
	}
	
	private static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		
		for(int index = 0; index < arr.length; index++) {
			sb.append(arr[index]);
			if(index < arr.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		testGraphConstruction();
		testAddingVerticesEdges();
		testDFS();
		testBFS();
		
	}
}