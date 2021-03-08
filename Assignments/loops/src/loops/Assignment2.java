package loops;

public class Assignment2 {
	public static void main(String[] args) {
		//print palindrome numbers between 100 to 999
		for (int num = 100; num <=999; num++) {
			if(num/100 == num%10) { //modulo is used here to return the last digit
				//if the quotient is equal to the last digit, the number is a palindrome
				System.out.println(num);
			}
		}
	}
}