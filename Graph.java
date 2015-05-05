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

    /* @ String from- origin city
     * @ return ArrayList<FlightInfo> - ArrayList
     * of all the edges from the specified city 
     */
    public ArrayList<FlightInfo> getEdges(String from){
	ArrayList<FlightInfo> flights = new ArrayList<FlightInfo>();
	for (Map.Entry<Pair,FlightInfo> entry : edges.entrySet()) {
	    if (entry.getKey().from.equals(from)) flights.add(entry.getValue());
	}
	    return flights;
    }

    /* @ return int- number of total edges in graph */
    public int numEdges(){
	return edges.size();
    }
	
    private Map<Pair,FlightInfo> edges;
}
