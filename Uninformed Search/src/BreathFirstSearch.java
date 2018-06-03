import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch 
{
	Node start;
    Node end;
    
    public BreathFirstSearch(Node startN, Node end){
        this.start = startN;
        this.end = end;
    }

    public boolean compute(){

        if(this.start.equals(end)){
            System.out.println("Goal Node Found!");
            System.out.println(start);
        }

        Queue<Node> queue = new LinkedList<>();
        ArrayList<Node> explored = new ArrayList<>();
        
        queue.add(this.start);
        explored.add(start);

        while(!queue.isEmpty())
        {
            Node current = queue.remove();
            if (current.equals(this.end)) {
                System.out.println(explored);
                return true;
            }
            else
            {
                if (current.getChildren().isEmpty())
                    return false;
                else
                    queue.addAll(current.getChildren());
            }
            	explored.add(current);
        }
 
        return false;

    }

}
