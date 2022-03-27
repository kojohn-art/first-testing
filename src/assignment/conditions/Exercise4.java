package assignment.conditions;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int inp = scanner.next().charAt(0);
		if(inp >= 65 && inp <= 90)
			System.out.println("Character is Capital letter");
		else if(inp>= 97 && inp<= 122)
			System.out.println("Character is small letter");
		else if(inp>=48 && inp<=57)
			System.out.println("Character is digit");
		else if ((inp>0 && inp <=47) || (inp>=58 && inp<= 64) ||
					(inp>= 91 && inp<=96) |(inp>= 123 && inp<= 127))
			System.out.println("Character is a special symbol");
		else 
				System.out.println("Sorry not found that character");
		
	}

}
