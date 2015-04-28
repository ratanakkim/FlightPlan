import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.text.*;



public class FlightSystem {
    public FlightSystem(String filename){
	Scanner sc = null;
	    try {
		sc = new Scanner(new FileReader(filename));  	   
            }
	    catch (FileNotFoundException e) {}
	    String s = sc.nextLine();
	    if (s.length() != 0)
	      {
	    	  while (sc.hasNextLine())
	    	  {
		      //deconstruct input file
		      SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/YYYY");     
		      // Date t = new Date(30);

		      Date t; 

		      try { 
			  t = ft.parse(s); 
			  System.out.println(t); 
		      } catch (ParseException e) { 
			  System.out.println("Unparseable using " + ft); 
		      }

		      
		      s = sc.nextLine();
	        	  if (s.startsWith("#")) s = sc.nextLine();
	    	  }
		  //Deconstruct last line
		  //  Date t = new Date(30);
	       	  //System.out.println(t.toString());
 //deconstruct input file
		      SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");     
		      // Date t = new Date(30);

		      Date t; 

		      try { 
			  t = ft.parse(s); 
			  System.out.println(t); 
		      } catch (ParseException e) { 
			  System.out.println("Unparseable using " + ft); 
		      }


	      }
	      sc.close();

    }


	      

}
