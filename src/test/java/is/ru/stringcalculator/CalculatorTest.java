package is.ru.stringcalculator
import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest 
{
	@Test
	public void testEmptyString()
	{
		Assert.assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber()
	{
		Assert.assertEquals(1, Calculator.add("1"));
	}
}
