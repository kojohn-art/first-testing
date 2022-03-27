package oop;

public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank to = new Bank();
		System.out.println(to.rent());
		Kbz k = new Kbz();
		System.out.println(k.rent());
		Cb b = new Cb();
		System.out.println(b.rent());
	}

}

class Bank{
	public double rent() {
		return 4.5;
	} 
}

class Kbz extends Bank{
	public double rent() {
		return 4.5;
	}
}

class Cb extends Bank{
	public double rent() {
		return 9.0;
	}
}



