package arrays;

import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {
		//setting up user input as an array
		Scanner s = new Scanner(System.in); //checks the inputs provided
		System.out.println("How many numbers are you going to type?");
		int input = s.nextInt(); //next integer corresponds to the question stated above
		System.out.println("List the " + input + " numbers:");
		int a[] = new int[input]; //array set up to receive input # of elements stated
		int even = 0;
		
		for(int i=0; i < input ; i++) {
				a[i] = s.nextInt();	
		}
		
		//find sum of the even numbers provided
		for(int j = 0; j < a.length; j++) {
			if(a[j]%2==0) {
				even += a[j];
			}
			
		}
		System.out.println("The sum of the even numbers from your input is: " + even);	//make sure the println is outside the loop
	}
}
