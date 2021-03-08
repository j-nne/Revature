package loops;

public class Assignment4 {

		public static void main(String[] args) {
			//find sum of even numbers and odd numbers between 1 and 100
			int evenSum=0; 
			int oddSum = 0;
			for(int i=1; i<=100; i++){
				if(i%2 == 0) {
					evenSum = evenSum + i; 	
				}else {
					oddSum += i;
				}
				//if sysout stays within the loop, every iteration will be printed
			} 
			System.out.println("The sum of even numbers between 1 and 100 is " + evenSum + ".");
			System.out.println("The sum of odd numbers between 1 and 100 is " + oddSum + ".");
			
			//which is larger?
			if(evenSum > oddSum) {
				System.out.println("The sum of even numbers is greater.");
			}else {
				System.out.println("The sum of odd numbers is greater.");
			}

		}
}
