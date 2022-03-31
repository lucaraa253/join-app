package Algos;

import java.util.Scanner;

public class Eggs {
	


	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
//		Gender Specifier
		System.out.println("How many eggs do you have");
		
		int numOfEggs = sc.nextInt();
		int gross = numOfEggs / 144;
		System.out.println("You have " + gross + " gross of eggs");
		
		int dozen = (numOfEggs % 144) / 12;
		System.out.println("You have " + dozen + " dozen eggs");
//		
		int remainder = (numOfEggs % 144) % 12;
		System.out.println("You have " + remainder + " remaining eggs");
		
		
	}
}
