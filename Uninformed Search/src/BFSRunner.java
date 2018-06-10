import java.util.ArrayList;
import java.util.Arrays;

public class BFSRunner {

    public static void main(String args[]){

        Node NYC = new Node("New York City",null);
        Node MIA = new Node("Miami",null);
        Node CHI = new Node("Chicago",null);
        Node DEN = new Node("Denver",null);
        Node SD = new Node("San Diego",null);
        Node SF = new Node("San Francisco",null); 
        Node LA = new Node("Los Angeles",null);
        Node DAL = new Node("Dallas",null);

        NYC.setChildren(new ArrayList<Node>(Arrays.asList(CHI,DEN,MIA,DAL)));
        LA.setChildren(new ArrayList<Node>(Arrays.asList(SD,SF,DEN,DAL)));
        CHI.setChildren(new ArrayList<Node>(Arrays.asList(NYC,SF,DEN)));
        DAL.setChildren(new ArrayList<Node>(Arrays.asList(NYC,SD,MIA,LA)));
        MIA.setChildren(new ArrayList<Node>(Arrays.asList(NYC,DAL)));
        SD.setChildren(new ArrayList<Node>(Arrays.asList(LA,DAL)));
        SF.setChildren(new ArrayList<Node>(Arrays.asList(LA,DEN,CHI)));
        DEN.setChildren(new ArrayList<Node>(Arrays.asList(CHI,NYC,LA,SF)));

        AbstractSearch bfs = new BreathFirstSearch(NYC, SD);

        if(bfs.search())
            System.out.print("Path Found!");
        else
        {
            System.out.print("Path Not Found :(");
        }
    }
}
