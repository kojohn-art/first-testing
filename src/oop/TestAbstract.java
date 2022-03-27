package oop;

public class TestAbstract {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Programer p = new Programer();
		p.doSo();
		Tester t  = new Tester();
		t.doSo();
		p.office();
		t.office();
		
	}

}

abstract class stuff {
	public void office() {
		System.out.println("Hello");
	}
	public abstract void doSo();
}

class Programer extends stuff{
	public void doSo() {
		System.out.println("Coding"); 
	}
}

class Tester extends stuff{
	public void doSo() {
		System.out.println("Testing");
	}
}
