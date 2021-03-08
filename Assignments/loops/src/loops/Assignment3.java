package loops;

public class Assignment3 {
	public static void main(String[] args) {
		//find odd numbers between 100 and 199
		for(int i = 100; i <= 199; i++) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
	}
}