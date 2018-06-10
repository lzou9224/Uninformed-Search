//AP JAVA Lab 5.1 Uninformed Search
//Lingli Zou
//Mr. Levin Pd.2

import java.util.ArrayList;

public class Node {

	Node parent;
	ArrayList<Node> children;
	
	public Node (ArrayList<Node> children, Node parent)
	{
		this.children = children;
		this.parent = parent;
	}
	 
	public boolean removeChild(Node n)
	 {
	        return false;
	 }
	 
	public Node getParent() 
	{
		return parent;
	}

	public void setParent(Node parent) 
	{
		this.parent = parent;
	}

	public ArrayList<Node>getChildren() //return a list of all connected nodes
	 {
	        ArrayList<Node>childNodes = new ArrayList<>();
	        
	        for(int x=0; x<children.size(); x++)
	        {
	        	if(this.children.get(x)!=null)
	        	{
	        		childNodes.add(this.children.get(x));
	        	}
	        	
	        }
	        	return childNodes;
	        
	        }
	 
	public void setChildren(ArrayList<Node> children)
	{
		this.children = children;
	}
}
