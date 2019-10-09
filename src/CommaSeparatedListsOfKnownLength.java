// INPUT FILE:
/*
Read the following two lines into two separate arrays:
Rectangle 1: 34, 64, -89, 24
Rectangle 2: 4, 6, 245, -2
 */

import java.util.Arrays;
import java.util.Scanner;

public class CommaSeparatedListsOfKnownLength {

	public static void main(String[] args){
		try{
			Scanner stdin = new Scanner(System.in);
			
			int[] rectangle1 = new int[4];
			int[] rectangle2 = new int[4];
			
			stdin.nextLine(); // get past that first line
			stdin.next(); stdin.next(); // get past "Rectangle 1:"
			stdin.useDelimiter("\\s+|\\s*,\\s*");
			
			for(int i = 0; i < 4; i++)
				rectangle1[i] = stdin.nextInt();
			
			stdin.next(); stdin.next(); // get past "Rectangle 2:"

			
			for(int i = 0; i < 4; i++)
				rectangle2[i] = stdin.nextInt();
			
			System.out.println(Arrays.toString(rectangle1));
			System.out.println(Arrays.toString(rectangle2));
	
			stdin.close();
		}
		catch(Exception e){
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}
	}
	
}
