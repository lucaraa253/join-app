package Algos;

import java.util.Scanner;

public class TotalTax {
	
	
	

	public static void main(String[] args) {
		
		double tax = 0;
		Scanner sc = new Scanner(System.in);
		
//		Gender Specifier
		System.out.println("Describe your gender : Male/Female");
		
		String gender = sc.next();
		

			while( !gender.equals("Male") || !gender.equals("Female")) {
				
				
				if(gender.equals("Male")) {
					break;
				}else if(gender.equals("Female")) {
					break;
				}else {
					System.out.println("Please enter a valid gender");
					gender = sc.next();
				}
			}

		
		
		
		
//		Annual income amount
		System.out.println("What is you annual income ?");
		int income = sc.nextInt();
		System.out.println("Your annual income is :" + income);
		
//		Tax bracket calculator
		if(gender.equals("Male") ) {
			if(income > 0 && income < 180000) {
				tax = 0;
			}
			else if(income > 180001 && income <= 500000) {
				tax = (income * 0.1);
			}
			else if(income > 500001 && income <= 800000) {
				tax = (income * 0.2);
			}
			else if(income > 800000) {
				tax = (income * 0.3);
			}
		}
		else if(gender.equals("Female") ){
			if(income > 0 && income < 190000) {
				tax = 0;
			}
			else if(income > 190001 && income < 500000) {
				tax = (income * 0.1);
			}
			else if(income > 500001 && income < 800000) {
				tax = (income * 0.2);
			}
			else if(income > 800000) {
				tax = (income * 0.3);
			}
		}
		
		System.out.println("Your tax owed will be : " + tax);

	}

}
