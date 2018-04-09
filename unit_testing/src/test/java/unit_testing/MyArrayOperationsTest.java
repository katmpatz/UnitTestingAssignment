package unit_testing;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

/**
 * @author Mpatziakoudi Katerina
 * Applied Software Engineering 
 * Unit Testing Assignment
 * April 2018
 */
public class MyArrayOperationsTest {
	
	MyArrayOperations mao = new MyArrayOperations();
	
	//Mock the MyFileUtilities dependency
	MyFileUtilities mfu = mock(MyFileUtilities.class);
	
	public MyArrayOperationsTest() {}

	@Test 
	public void test_gradeFrequencies_normal_case_Mocking() {
		
		when(mfu.readFile("src\\test\\resources\\grades1.txt")).thenReturn(new int[]{5, 6, 9, 10, 4}); //test normal case
		
		int[] array = {0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 1}; //frequency for grades = {5, 6, 9, 10, 4}
		Assert.assertArrayEquals(array, mao.gradeFrequencies("src\\test\\resources\\grades1.txt", mfu));
	}
	
	@Test 
	public void test_gradeFrequencies_empty_case_Mocking() {
		
		when(mfu.readFile("src\\test\\resources\\grades2.txt")).thenReturn(new int[]{}); //test normal case
		
		int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //frequency for grades = {}	
		Assert.assertArrayEquals(array, mao.gradeFrequencies("src\\test\\resources\\grades2.txt", mfu));
	}
	
	
}

