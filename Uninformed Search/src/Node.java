//AP JAVA Lab 5.1 Uninformed Search
//Lingli Zou
//Mr. Levin Pd.2

import java.util.ArrayList;

public class Node {

	public String Map; //test map of the United States
	
		Node left;
		Node right;
		
	public Node (String Map, Node first, Node second)
	{
		this.Map = Map;
		this.left.left = first;
		this.right = second;
	}
	
	 public ArrayList<Node>getChildren() //return a list of all connected nodes
	 {
	        ArrayList<Node>childNodes = new ArrayList<>();
	        
	        if (this.left != null)
	        {
	            childNodes.add(left);
	        }
	        
	        if (this.right != null) 
	        {
	            childNodes.add(right);
	        }
	        return childNodes;
	    }
	 
	 
	 public boolean removeChild(Node n)
	 {
	        return false;
	 }
}
