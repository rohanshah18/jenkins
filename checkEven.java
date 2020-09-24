import java.io.*;
import java.util.Scanner;

public class checkEven{
	public static void main(String[] args) throws IOException {

		int test_var = 27;
		String fileName = "BuildHistory.txt";

		//Instantiating the Scanner class to read the file
		Scanner sc = new Scanner(new File(fileName));
		StringBuffer buffer = new StringBuffer();

		//Reading lines of the file and appending them to StringBuffer
		while (sc.hasNextLine()) {
			buffer.append(sc.nextLine()+System.lineSeparator());
		}

		sc.close();

		int testCount = Character. getNumericValue(buffer.charAt(0)) + 1;
		// isEven() is student designed function
		String result = (test_var%2 == 0 && helper.isEven(test_var))? " has passed " : " has failed ";
		String newLine = "Build " + testCount + result + "for integer value: " + test_var;

		buffer.append(newLine);
		buffer.replace(0,1, Integer.toString(testCount));

		//Writing to the buildhistory file
		FileWriter writer = new FileWriter(fileName);
		writer.append(buffer);
		writer.flush();

	}
}