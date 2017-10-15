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
			String numbers[] = text.split(",");
			int number = toInt(numbers[0]) + toInt(numbers[1]);
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
