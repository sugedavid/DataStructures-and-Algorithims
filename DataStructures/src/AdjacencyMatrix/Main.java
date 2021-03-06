package AdjacencyMatrix;

public class Main {
	
public static void main(String[] args) {
		
		// Adjacency Matrix = An array to store 1's/0's to represent edges
		//				       # of rows =    # of unique nodes
		//				       # of columns = # of unique nodes
			
		//					  runtime complexity to check an Edge: O(1)
		//					  space complexity: O(v^2)
		
		Graph graph = new Graph(5);
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
        graph.addEdge(1, 4); // I forgot this line in the video
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();
		
		// depth first search
		System.out.println("\n");
		graph.depthFirstSearch(0);
		
		// breadth first search
		System.out.println("\n");
		graph.breadthFirstSearch(0);
		System.out.println("\n");

		
		System.out.println(graph.checkEdge(0, 1));
	}


}
