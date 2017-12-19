/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
import java.util.Random;
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if ((statement.length()==2&&statement.substring(0,2).equals("no"))
				|| (statement.length()>2 && statement.substring(0,2).equals("no") &&statement.substring(2,3).equals(" ") ))
				
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(statement.indexOf("weather")>=0
				|| statement.indexOf("a nice day")>=0){
			response = getRandomResponseWeather();
		}
		else if(statement.indexOf("love")>=0
				|| statement.indexOf("girlfriend")>=0
				|| statement.indexOf("boyfriend")>=0){
			response = getRandomResponseLove();
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		Random rng = new Random();
		int whichResponse = rng.nextInt(3);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		return response;
	}

private String getRandomResponseWeather()
{
	Random rng = new Random();
	int whichResponse = rng.nextInt(2);
	String response = "";
	
	if (whichResponse == 0)
	{
		response = "It's a nice day.";
	}
	else if (whichResponse == 1)
	{
		response = "It's cloudy.";
	}
	else if (whichResponse == 2)
	{
		response = "Rainy.";
	}
	
	return response;
}
private String getRandomResponseLove()
{
	Random rng = new Random();
	int whichResponse = rng.nextInt(3);
	String response = "";
	
	if (whichResponse == 0)
	{
		response = "You deserve a better one.";
	}
	else if (whichResponse == 1)
	{
		response = "You freak me out";
	}
	else if (whichResponse == 2)
	{
		response = "Come on, babe.";
	}
	
	return response;
}
}

