package day2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int costPrice,result,sellingPrice;
		Scanner scanner =new Scanner(System.in);
		System.out.print("Enter CostPrice here: ");
		int cp = scanner.nextInt();
		System.out.print("Enter SellingPrice here: ");
		int sp = scanner.nextInt();
		if(sp>cp) {
			result = sp-cp;
			System.out.println("Profit: "+ result);
		}else if(cp>sp) {
			result= cp- sp;
			System.out.println("Lost: " + result);
		}else {
			System.out.println("No benefit or lost.");
		}
		
		
		
		
	}

}
