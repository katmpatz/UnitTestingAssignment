package unit_testing;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author Mpatziakoudi Katerina
 * Applied Software Engineering 
 * Unit Testing Assignment
 * April 2018
 */
@RunWith(Suite.class)
@SuiteClasses({ MyMathTest.class, MyMathTest_ReverseNumber_Parameterized.class })
public class AllTests {
	//Test MyMathTest and MyMathTest_ReverseNumber_Parameterized at the same time
}
