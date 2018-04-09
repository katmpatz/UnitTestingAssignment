package unit_testing;

/**
 * @author Mpatziakoudi Katerina
 * Applied Software Engineering 
 * Unit Testing Assignment
 * April 2018
 */
public class MyArrayOperations {

	int counter0; //counts how many times 0 appears to the file
	int counter1; //counts how many times 1 appears to the file
	int counter2; //counts how many times 2 appears to the file
	int counter3; //counts how many times 3 appears to the file
	int counter4; //counts how many times 4 appears to the file
	int counter5; //counts how many times 5 appears to the file
	int counter6; //counts how many times 6 appears to the file
	int counter7; //counts how many times 7 appears to the file
	int counter8; //counts how many times 8 appears to the file
	int counter9; //counts how many times 9 appears to the file
	int counter10; //counts how many times 10 appears to the file
	
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
				switch(num_grade) {
	    		case 0: grades_frequency[num_grade] = ++counter0;
	    				break;
	    		case 1:grades_frequency[num_grade] = ++counter1;
	    				break;
	    		case 2:grades_frequency[num_grade] = ++counter2;
	    				break;
	    		case 3:grades_frequency[num_grade] = ++counter3;
	    				break;
	    		case 4:grades_frequency[num_grade] = ++counter4;
	    				break;
	    		case 5:grades_frequency[num_grade] = ++counter5;
	    				break;
	    		case 6:grades_frequency[num_grade] = ++counter6;
	    				break;
	    		case 7:grades_frequency[num_grade] = ++counter7;
	    				break;
	    		case 8:grades_frequency[num_grade] = ++counter8;
	    				break;
	    		case 9:grades_frequency[num_grade] = ++counter9;
	    				break;
	    		case 10:grades_frequency[num_grade] = ++counter10;
	    				break;
	    		default:break;
	    		}
			}
		    		
		return grades_frequency;
		
	}
	
}
