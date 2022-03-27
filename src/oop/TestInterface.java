package oop;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trysome ts = new Trysome();
		ts.intertest();
		Dosome ds = new Dosome();
		ds.intertest();
	}

}

interface inta{
	public void intertest();
}

class Trysome implements inta{
	public void intertest()  {
		System.out.println("Hello I am trying");
	}  	
}
class Dosome implements inta{
	public void intertest()  {
		System.out.println("Hello I am doing");
	}  
}