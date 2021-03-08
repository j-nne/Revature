package arrays;

public class Assignment6 {

	public static void main(String[] args) {
		
		int ar[]=new int[6];
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		int n=4; //use n to keep track of elements in array
		System.out.println("Before Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		int ele=100;
		int pos=5;
		for(int i=n;i>pos-1;i--) {
			ar[i]=ar[i-1];   //updating array
		}
		ar[pos-1]=ele; //inserting array
		n++;
		
		System.out.println("\n\nAfter Insertion");
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
		
		int delpos=2;
		for (int i = delpos-1; i < n; i++) {
			ar[i]=ar[i+1];
		}
		n--;
		System.out.println("\n\nAfter Deletion from positon "+delpos);
		for (int i = 0; i < n; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}