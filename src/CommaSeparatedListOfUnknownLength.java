// INPUT FILE:
/*
Read each of the following lines into an array
34, 64, -89, 24, 4, 6, 2, 64, 24
-4234
 */

import java.util.ArrayList;
import java.util.Scanner;

public class CommaSeparatedListOfUnknownLength {
	public static void main(String[] args){
		Scanner stdin = new Scanner(System.in);
		Scanner lineScanner;
		String line;
		stdin.nextLine(); // go past the first line
		
		line = stdin.nextLine();
		lineScanner = new Scanner(line);
		lineScanner.useDelimiter("(,\\s)|(\\s)");
		ArrayList<Integer> first = new ArrayList<Integer>();
		while(lineScanner.hasNextInt()){
			first.add(lineScanner.nextInt());
		}
		lineScanner.close();
		
		line = stdin.nextLine();
		lineScanner = new Scanner(line);
		lineScanner.useDelimiter("(,\\s)|(\\s)");
		ArrayList<Integer> second = new ArrayList<Integer>();
		while(lineScanner.hasNextInt()){
			second.add(lineScanner.nextInt());
		}
		lineScanner.close();
		stdin.close();
		
		System.out.println(first);
		System.out.println(second);
		
	}
}
