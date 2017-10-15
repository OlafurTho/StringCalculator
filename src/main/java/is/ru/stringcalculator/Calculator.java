package is.ru.stringcalculator

public class Calculator
{	public static int add(String text)
	{
	if(text.equals(""))
	{
		return 0;
	}	
	else
	{
		
		int number = 0;
		if(text.contains(",") || text.contains("/n"))
		{
			String numbers[] = text.split(",|/n");	
			for(int i = 0; i < numbers.length; i++)
			{
				number += toInt(numbers[i]);
			}
			return number;
		}
		return toInt(text);
	}
	}
	
	public static int toInt(String text)
	{
		return Integer.parseInt(text);
	}
}
