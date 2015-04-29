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
		  Date t;
		  String[] fields = content.split(",|\\[|\\]|\\n");		
      		  List<String> af = Arrays.asList(fields);
		  ArrayList<String> ff = new ArrayList<String>();
			  for (String temp: af){
			      if (temp.length() > 0) ff.add(temp);
			  }
			   for (int i = 0; i != ff.size()/7; ++i){
			       try {
				   t = ft.parse(ff.get(1+i*7) + "-" + ff.get(0+i*7));
				   
				   //time data
				   //   System.out.println(ff.get(1+i*7));
				   //System.out.println(t);
				   System.out.println("Adding edge from " + ff.get(2+i*7) + " to " + ff.get(3+i*7));
			       } catch (ParseException e) {
				   throw new MyException("Parse Failure");
			       }
			   }
			 	       
	     
    }	      

}
