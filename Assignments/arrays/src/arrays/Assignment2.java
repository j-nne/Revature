package arrays;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter initial value: ");
		int start = s.nextInt();
		System.out.println("Enter final value: ");
		int end = s.nextInt();
		for (int i = start; i <= end; i++) {
			if(i/100 == i%10) { 
				System.out.println(i);				
			}
		}
	}
}