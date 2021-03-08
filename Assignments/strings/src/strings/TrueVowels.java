package strings;

import java.util.Scanner;

public class TrueVowels {
	
	//print true if all vowels are present
	//I'm unsure on how to make this one work properly

	public static void main(String[] args) {
	      int count = 0;
	      System.out.println("Enter a sentence :");
	      Scanner sc = new Scanner(System.in);
	      String sentence = sc.nextLine();

	      for (int i=0 ; i<sentence.length(); i++){
	         char ch = sentence.charAt(i);
	         switch (ch) {
				case 'a': case 'e':case 'i':case 'o':case 'u':
					count = 1;
				}
	      }
	         if(count == 1) {
	            System.out.println(true);
	         }else {
	        	 System.out.println(false);
	      System.out.println("Number of vowels in the given sentence is " + count);
	         }
		}
	}