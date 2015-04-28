import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.text.*;



public class FlightSystem {
    public FlightSystem(String filename)
    throws MyException
    {
	Scanner sc = null;
	    try {
		sc = new Scanner(new FileReader(filename));  	   
            }
	    catch (FileNotFoundException e) {}
	    String s = sc.nextLine();
	    if (s.length() != 0)
	      {
		  SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/YYYY");
		  Date t; 
	    	  while (sc.hasNextLine())
	    	  {   
		      try { 
			  t = ft.parse(s); 
			  System.out.println(t); 
		      } catch (ParseException e) {
			  throw new MyException("incorrectly formatted flight data");
		      }
		      s = sc.nextLine();
	              if (s.startsWith("#")) s = sc.nextLine();
	    	  }
		 
		      try { 
			  t = ft.parse(s); 
			  System.out.println(t); 
		      } catch (ParseException e) {
			  throw new MyException("incorrectly formatted flight data");
		       }

	      }
	      sc.close();
    }	      

}
