package arrays;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		//find max and min value of an array input
		Scanner s = new Scanner(System.in);
		System.out.println("How many values will you be inputting?");
		int v = s.nextInt();
		System.out.println("List your numbers.");
		int a[] = new int[v];
		
		for(int i=0; i < v ; i++) {
			a[i] = s.nextInt();	
	}
		//calling maxValue method to obtain maximum value
		int max = maxValue(a);
		System.out.println("Maximum value is: " + max);
		
		//calling minValue method to obtain minimum value
		int min = minValue(a);
		System.out.println("Minimum value is: " + min);
	}	
		
		//method to get max value
		public static int maxValue(int[] input) {
			int maxNum = input[0];
			for(int i=0; i<input.length; i++) {
				if(input[i] > maxNum) {
					maxNum = input[i];
			}
		}
			return maxNum;
}

	//method to get min value
			public static int minValue(int[] input) {
				int minNum = input[0];
				for(int i=0; i<input.length; i++) {
					if(input[i] < minNum) {
						minNum = input[i];
					}
				}
				return minNum;
			}
	}