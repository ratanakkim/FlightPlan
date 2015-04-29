import java.util.*;

public class Graph{
    public Graph () {
	edges = new HashMap<Pair,FlightInfo>();
    }
    
    public void addEdge(FlightInfo flight){
	Pair temp = new Pair();
	temp.from = flight.origin;
	temp.to = flight.dest;
	edges.put(temp,flight);
	System.out.println("Adding edge from " + temp.from + " to " + temp.to); 
    }
	
    private HashMap<Pair,FlightInfo> edges;
}
