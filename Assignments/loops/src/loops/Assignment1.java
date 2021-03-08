package loops;

public class Assignment1 {
	public static void main(String[] args) {
		 //for loop 
		for (int i = 0; i<=5; i++) {
			System.out.println(i);
			}			
		//if loop
		double iceCreamCost = 3.50;
		double amountOnHand = 5.00;
			if(amountOnHand > iceCreamCost){
				System.out.println("You can afford the treat.");
			}
			
		//if-else loop
		int numCoffeeCups = 55;
		if (numCoffeeCups > 40) {
				System.out.println("There's enough coffee cups for the board meeting!");	
			}else {
				System.out.println("There aren't enough coffee cups  in for the meeting.");
			}
			
		//while loop
			int a = 5;
			while (a < 10) {
				System.out.println(a);
				a++;
			}
			
			//do while loop
			int b = 0;
			do {
				System.out.println("This text will be shown regardless.");
			}while(b >= 5);
				
			}
}