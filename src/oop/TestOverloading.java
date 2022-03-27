package oop;

public class TestOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dosome(34);
		Dosome(3,4);
		Dosome(5,4,3);
	}		


public static void Dosome(int a) {
	System.out.println(a);
}

public static void Dosome(int b,double c) {
	System.out.println(b+c);
}

public static void Dosome(int a,int b,int c) {
	System.out.println(a+b+c);
}
}