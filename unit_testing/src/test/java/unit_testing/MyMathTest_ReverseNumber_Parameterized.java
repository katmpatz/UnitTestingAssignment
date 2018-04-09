package unit_testing;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;



import org.junit.Test;

/**
 * @author Mpatziakoudi Katerina
 * Applied Software Engineering 
 * Unit Testing Assignment
 * April 2018
 */
@RunWith(Parameterized.class)
public class MyMathTest_ReverseNumber_Parameterized {

	private int number; //the integer input number
	private int result; //the result after reverse
	private MyMath mm;
	
	@Before //Executed before each test method
	   public void initialize() {
		mm = new MyMath();
	   }

	   public MyMathTest_ReverseNumber_Parameterized(Integer number, Integer result) {
	      this.number = number;
	      this.result = result;
	   }
	
	@Parameterized.Parameters //All the Parameters which I want to check
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {{1,-1},{-2,2},{0,0},{Integer.MAX_VALUE,-Integer.MAX_VALUE}};
		
		return Arrays.asList(data);
	}
	
	@Test
	public void test_reverseNumber() {
		Assert.assertEquals(result, mm.reverseNumber(number));
	}

}
