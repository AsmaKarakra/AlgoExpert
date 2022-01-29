/**

Time: O(V+E) - Traverseing the nodes and edges of the graph 

Space: O(V) - Storing children of graph in array and returning it 


**/ 



import java.util.*;

class Program {

  // Graph as Objects 
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }
    
    //DFS method is within graph class 

    public List<String> depthFirstSearch(List<String> array) {
	    array.add(this.name); 
	    for(int i = 0; i < children.size(); i++){
		Node child = children.get(i); 
		child.depthFirstSearch(array);
	    }
			
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
