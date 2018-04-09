package unit_testing;

/**
 * @author Mpatziakoudi Katerina
 * Applied Software Engineering 
 * Unit Testing Assignment
 * April 2018
 */
public class MyMath {
	
	/**Performs a division between two numbers and returns the result.
	 * Zero denominator cause an {@link IllegalArgumentException}
	 * @param num the integer input number for the first part of the division(numerator)
	 * @param denom  the integer input number for the second part of the division(denominator)
	 * @exception IllegalArgumentException when denominator is equals to zero
	 * @return
	 * A double value with the result of division
	 */
	public double divide(int num, int denom){
		if(denom != 0) {
			return num / denom;
		} else {
			throw new IllegalArgumentException("'denominator' cannot be zero");
		}
	}
	
	/**Get an integer as input and returns its reverse number.
	 * Zero denominator cause an {@link IllegalArgumentException}
	 * @param number the integer input number which we want to reverse
	 * @return
	 * An integer value with the result of reverse
	 */
	public int reverseNumber(int number) {
		return -number;
	}

}
