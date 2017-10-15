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
}
