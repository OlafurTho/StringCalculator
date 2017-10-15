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
		if(text.contains(","))
		{
			int number = 0;
			if(text.contains(","))
			{
			String numbers[] = text.split(",");	
			for(int i = 0; i < numbers.length; i++)
			{
				number += toInt(numbers[i]);
			}
			return number;
			}	
		}
		return toInt(text);
	}
	}
	
	public static int toInt(String text)
	{
		return Integer.parseInt(text);
	}
}
