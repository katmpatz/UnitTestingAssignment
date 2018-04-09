package unit_testing;

import org.junit.Test;
import org.junit.Assert;

/**
 * @author Mpatziakoudi Katerina
 * Applied Software Engineering 
 * Unit Testing Assignment
 * April 2018
 */
public class MyMathTest {
	
	MyMath mm = new MyMath();

	@Test //Check an example of a normal case
	public void test_divide_normal_case() {
		Assert.assertEquals(3,5 , mm.divide(7, 2));
	}
	
	@Test //Check a division with the numerator equals to zero
	public void test_divide_zero_numerator() {
		Assert.assertEquals(0,0 , mm.divide(0, 2));
	}
	
	//Check a division with the denominator equals to zero
	@Test (expected = IllegalArgumentException.class)
	public void test_divide_zero_denumerator_exception() {
		mm.divide(5, 0);
	}
	
	//Check a division with the numerator and the denominator equal to zero
	@Test (expected = IllegalArgumentException.class)
	public void test_divide_zero_exception() {
		mm.divide(0, 0);
	}

}
