package unit_testing;

/**
 * @author Mpatziakoudi Katerina
 * Applied Software Engineering 
 * Unit Testing Assignment
 * April 2018
 */
public class MyArrayOperations {

	/**A method that use an object of MyFileUtilities class to read a file that contains 
	 * grades and returns an array that contains the frequencies of the grades 
	 * @param filepath the String input path of the file
	 * @param utils the MyFileUtilities input object
	 * @exception IllegalArgumentException when an exception occurs while reading the file (i.e., the file doesn’texist)
	 * @return
	 * An array that contains the frequencies of the grades
	 */
	public int[] gradeFrequencies(String filepath, MyFileUtilities utils) {
		int[] grades_frequency = new int[11];
	
			int[] grades = utils.readFile(filepath);
			for(int i = 0; i < grades.length; i++) {
				int num_grade = grades[i];
				++grades_frequency[num_grade];
			}
		    		
		return grades_frequency;
		
	}
	
}
