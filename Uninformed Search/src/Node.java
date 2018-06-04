//AP JAVA Lab 5.1 Uninformed Search
//Lingli Zou
//Mr. Levin Pd.2

import java.util.ArrayList;

public class Node {

	public String Map; //test map of the United States
	
		int posx;
		int posy;
		
		ArrayList <Node> children;
		Node parent;
		
	public Node (String Map, int x, int posx, int posy)
	{
		this.Map = Map;
		this.posx = posx;
		this.posy = posy;
	}
	
	 public Node(String string, Object object) 
	 {
		 
	 }

	public ArrayList<Node>getChildren() //return a list of all connected nodes
	 {
	        ArrayList<Node>childNodes = new ArrayList<>();
	        
	        if (this.x != null)
	        {
	            childNodes.add(x);
	        }
	        
	        if (this.y != null) 
	        {
	            childNodes.add(y);
	        }
	        return childNodes;
	    }
	 
	 public class setChildren(ArrayList<Node>children)
	 {
		 this.children = children;
	 }
	 
	 public boolean equals(Object x)
	 {
		 Node check = (Node)x;
		 return(check.point.equals(x));
	 }
	 
	 public boolean removeChild(Node n)
	 {
	        return false;
	 }
}

	public void setChildren(ArrayList<Node> arrayList) 
	{
		// TODO Auto-generated method stub
		
	}
	}
