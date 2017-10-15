package is.ru.stringcalculator


public class Calculator
{
	public static int add(String text)
	{
		if(text.equals(""))
		{
			return 0;
		}
		else if(text.contains("-"))
		{
			int counter = 0;
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < text.length(); i++)
			{
				if(text.charAt(i) == '-')
				{
					if(!(counter == 0))
					{
						sb.append(",");
					}
					sb.append(text.charAt(i));
					sb.append(text.charAt(i+1));
					i = i+2;
					counter++;
					}
				}
			throw new IllegalArgumentException("Negatives not allowed: " + sb);	
		}
		else	
		{
			int number = 0;
			if(text.startsWith("//"))
			{
				char delimeter = text.charAt(2);
				StringBuilder sb = new StringBuilder();

				for(int i = 0; i < text.length(); i++)
				{
					if(text.charAt(i) == delimeter)
					{
						if(text.charAt(i) == delimeter)
						{
							sb.append(",");
						}
						else 
						{
							sb.append(text.charAt(i));							
						}
					}
				}
				text = sb.toString();
			}

			if(text.contains(",") || text.contains("\n"))
			{
				String numbers[] = text.split(",|\n");	
				for(int i = 0; i < numbers.length; i++)
				{
					if(!(toInt(numbers[i]) > 1000))
					{
						number += toInt(numbers[i]);						
					}
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
