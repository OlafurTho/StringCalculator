package is.ru.stringcalculator
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
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
	@Test
	public void testTwoNumbers()
	{
		Assert.assertEquals(3, Calculator.add("1,2"));
	}
	@Test
	public void testMultipleNumbers()
	{
		Assert.assertEquals(6, Calculator.add("1,2,3"));
	}
	@Test
	public void testTwoNumbersNewLine()
	{
		Assert.assertEquals(3, Calculator.add("1\n2"));
	}
	@Test
	public void testMultipleNumbersNewLine()
	{
		Assert.assertEquals(12, Calculator.add("4\n3,5"));
	}
	@Test
	public void testNegativeNumbers()
	{
		try
		{
			Calculator.add("2,-4, 3, -5");
		}
		catch(IllegalArgumentException e)
		{
			assertThat(e.getMessage(), is("Negatives not allowed: -4,-5"));
		}
	}
	@Test
	public void testNegativeNumber()
	{
		try
		{
			Calculator.add("-1");
		}
		catch(IllegalArgumentException e)
		{
			assertThat(e.getMessage(), is("Negatives not allowed: -1"));
		}
	}
	@Test
	public void testOverThousand()
	{
		Assert.assertEquals(8, Calculator.add("1001,3,5"));
	}
	@Test
	public void testNewDelimeter()
	{
		Assert.assertEquals(5, Calculator.add("//a2a3" ));
	}
}

