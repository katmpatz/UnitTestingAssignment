package unit_testing;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.Assert;
import org.junit.Rule;

/**
 * @author Mpatziakoudi Katerina
 * Applied Software Engineering 
 * Unit Testing Assignment
 * April 2018
 */

public class MyFileUtilitiesTest {
	
	MyFileUtilities mfu = new MyFileUtilities();
	
	//Test the normal case of an input file of grades
	@Test
	public void test_readFile_normal_case() {
		int[] array = {5, 6, 9, 10, 4};
		Assert.assertArrayEquals(array, mfu.readFile("src\\test\\resources\\grades1.txt"));
	}
	
	//Test case of an empty file of grades
	@Test
	public void test_readFile_empty_case() {
		int[] array = {};
		Assert.assertArrayEquals(array, mfu.readFile("src\\test\\resources\\grades2.txt"));
	}
	
	//Check the exception handling
	@Rule 
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void test_readFile_RuleException() {
		thrown.expect(IllegalArgumentException.class);
		mfu.readFile("grades5.txt");// non exist file
	}

}
