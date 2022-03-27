package assignment.conditions;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tensil,hardness;
		double carbon;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Hardness here: ");
		int hd = sc.nextInt();
		System.out.print("Enter Tensil here: ");
		int ts = sc.nextInt();
		System.out.print("Enter Carbon here: ");
		float cb = sc.nextFloat();
		if(hd>50 && cb<0.7 && ts>5600) {
			System.out.println("Grade 10");
		}else if(hd>50 && cb<0.7 ) {
			System.out.println("Grade 9");
		}else if( cb<0.7 && ts>5600) {
				System.out.println("Grade 8");
		}else if(hd>50 && ts>5600) {
			System.out.println("Grade 7");
		}else if(hd>50 || cb<0.7 || ts>5600) {
			System.out.println("Grade 6");
		}
		else {
			System.out.println("None of the conditons are met.");
		}
	}
}
