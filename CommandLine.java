
//Deal with given arguments
//Default to input file given by
//args[0]
public class CommandLine {
	public static void main (String args[])
	{
	  try {
	      FlightSystem p = new FlightSystem(args[0]);
	  } catch (MyException e){
	      System.out.println(e.err);
	  }
	}

}
