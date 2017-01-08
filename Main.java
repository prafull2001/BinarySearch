import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number to be found in the array using Binary Search");
		int desired = in.nextInt();
		in.close();
		
		BinarySearch mySearch = new BinarySearch();
		
		System.out.println("Index for " + desired + " is: " + mySearch.findIndex(desired));
		
	}
	
	
}

