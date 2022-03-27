package oop;

public class Testinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		AnimalTest an = new AnimalTest();
		Cat c = new Cat();
		c.doEat();
		c.doSo();
		Dog d = new Dog();
		d.doBark();
		d.doSo();
		
	}

}
class Animal{
	public void doSo() {
		System.out.println("Hello");
	}
}



class Dog extends Animal{
	public void doBark() {
		System.out.println("Woof Woof");
	}
}	

class Cat extends Animal{
	public void doEat() {
		System.out.println("fish");
	}
	}




