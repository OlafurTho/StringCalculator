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
	@Test
	public void testTwoNumbers()
	{
		Assert.assertEquals(3, Calculator.add("1,2"));
	}
	@Test
	public void testTwoNumbersNewLine()
	{
		Assert.assertEquals(3, Calculator.add("1/n2"));
	}
	@Test
	public void testMultipleNumbers()
	{
		Assert.assertEquals(6, Calculator.add("1,2,3"));
	}
	@Test
	public void testMultipleNumbersNewLine()
	{
		Assert.assertEquals(12, Calculator.add("4/n3,5"));
	}
}
