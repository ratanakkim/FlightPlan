import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.text.*;



public class Graph{
    public Graph(String filename)
    throws MyException
    {
       edges = new HashMap<Pair,FlightInfo>();
    }

    private Map<Pair,FlightInfo> edges;

}