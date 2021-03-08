package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) {
		//find 2nd max value
		Scanner s = new Scanner(System.in);
		System.out.println("How many values will you be inputting?");
		int v = s.nextInt();
		System.out.println("List your numbers.");
		int a[] = new int[v];
		
		
		for(int i=0; i < v ; i++) {
			a[i] = s.nextInt();	
		}
		
		for (int j = 0; j < a.length; j++) {
				Arrays.sort(a);
			}
		
		int max = a[a.length-2];
			System.out.println("The second maximum value from the input is " + max);
			
			}
}