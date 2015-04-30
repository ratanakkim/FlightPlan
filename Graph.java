import java.util.*;


/* Directied graph of flights
 * @edges - Map from origion destination node pairs (Strings)
 * to Flight data info 
 */
public class Graph{
    public Graph () {
	edges = new HashMap<Pair,FlightInfo>();
    }
    

    /*
     * @flight- Object of FlightInfo class corresponding
     * to flight info for string of input 
     * 
     */
    public void addEdge(FlightInfo flight){
	Pair temp = new Pair();
	temp.from = flight.origin;
	temp.to = flight.dest;
	edges.put(temp,flight);
    }


    /* Prints all edges currently in the Graph */
    public void printEdges(){
	for (Map.Entry<Pair,FlightInfo> entry : edges.entrySet()) {
	    System.out.println("(" + entry.getKey().from + "," + entry.getKey().to + ")");
	}
    }
    
	
    private Map<Pair,FlightInfo> edges;
}
