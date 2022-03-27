package day2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int inp = scanner.nextInt();
		if(inp >= 65 && inp <= 90)
			System.out.println("Character is A - Z");
		else if(inp>= 97 && inp<= 122)
			System.out.println("Character is a -z");
		else if(inp>=48 && inp<=57)
			System.out.println("Character is 0 - 9");
		else if ((inp>0 && inp <=47) || (inp>=58 && inp<= 64) ||
					(inp>= 91 && inp<=96) |(inp>= 123 && inp<= 127))
			System.out.println("Character is a special symbol");
		else 
				System.out.println("Sorry not found that character");
		
	}

}
