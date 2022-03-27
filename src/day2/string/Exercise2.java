package day2.string;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String sb = sc.nextLine();
		sb =sb.trim();
		String str1 ="";
		for(int i=1;i<sb.length();i++) {
			char chn = sb.charAt(i);
			if(chn != ' ') {
				str1 =str1+chn;
			}else {
				System.out.print(str1.toUpperCase().charAt(0)+"");
				str1="";
			}
		}
		  String str2 = "";
	      for (int j = 0; j < str1.length(); j++) {
	         if (j == 0)
	            str2 = str2 + Character.toUpperCase(str1.charAt(0));
	         else
	            str2 = str2 + Character.toLowerCase(str1.charAt(j));
	      }
	      System.out.println(str2);
		
		
	}

}
