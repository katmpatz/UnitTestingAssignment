package unit_testing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * @author Mpatziakoudi Katerina
 * Applied Software Engineering 
 * Unit Testing Assignment
 * April 2018
 */
public class MyFileUtilities {
	String filePath; //the String input path of the file
	BufferedReader br;
	String line="";
	static int size=0;
	
	/**A method that reads a file that contains grades and returns its contents in an integer array
	 * @param filepath the String input path of the file
	 * @exception IllegalArgumentException when an exception occurs while reading the file (i.e., the file doesn’texist)
	 * @return
	 * An integer array with file's contents
	 */
	public int[] readFile(String filePath) {
		ArrayList<Integer> grades_frequency = new ArrayList<Integer>();
		try {
		    br = new BufferedReader(new FileReader(filePath));
		    try {
		    	while((line = br.readLine()) != null) {
		    		int num_grade = Integer.parseInt(line);
		    		grades_frequency.add(num_grade);
		    		size++;
		         }
		    	br.close();
		    }
		    catch (Exception e) {
		    	throw new IllegalArgumentException("Error while reading the file: IOException ");
		    }
		} catch (FileNotFoundException e) {
			throw new IllegalArgumentException("Error while reading the file: FileNotFoundException");
		}
		int[] grades = new int[size];
		for(int i=0;i<size;i++){
			grades[i] = grades_frequency.get(i);
		}
		return grades;
	}
	


	
	
	
}
