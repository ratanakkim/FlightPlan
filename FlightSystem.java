import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.text.*;



public class FlightSystem {
    public FlightSystem(String filename)
    throws MyException
    {
	String content = null;
	    try {
		content = new Scanner(new FileReader(filename)).useDelimiter("\\Z").next();	   
            }
	    catch (FileNotFoundException e) {}
	      	  SimpleDateFormat ft = new SimpleDateFormat ("HH:mm-dd/MM/yyyy"); 
		  String[] fields = content.split(",|\\[|\\]|\\n");		
      		  List<String> af = Arrays.asList(fields);
		  ArrayList<String> ff = new ArrayList<String>();
		  Graph allFlights = new Graph();
			  for (String temp: af){
			      if (temp.length() > 0) ff.add(temp);
			  }
			   for (int i = 0; i != ff.size()/7; ++i){
			       try {
				   FlightInfo temp = new FlightInfo();
				   temp.date = ft.parse(ff.get(1+i*7) + "-" + ff.get(0+i*7));
				   temp.origin = ff.get(2+i*7);
				   temp.dest = ff.get(3+i*7);
				   temp.duration = Integer.parseInt(ff.get(4+i*7));
				   temp.airline = ff.get(5+i*7);
				   temp.cost = Integer.parseInt(ff.get(6+i*7));
				   allFlights.addEdge(temp);
 			       } catch (ParseException e) {
				   throw new MyException("Parse Failure");
			       }
			   }
			   allFlights.printEdges();
	
    }
}
