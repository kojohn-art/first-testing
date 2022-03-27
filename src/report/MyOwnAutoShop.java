package report;

import java.util.ArrayList;
import java.util.List;

public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan = new Sedan(100, 20000, "black", 20);
		Ford ford1 = new Ford(90, 15000, "blue", 2010, 150);
		Ford ford2 = new Ford(110, 20000, "pink", 2015, 750);
		Car car = new Car(80, 10000, "red");
//		System.out.println(sedan.getSalePrice());
//		System.out.println(ford1.getSalePrice());
//		System.out.println(ford2.getSalePrice());
//		System.out.println(car.getSalePrice());
//		
		List<Car> cars = new ArrayList<>();
		cars.add(sedan);
		cars.add(ford1);
		cars.add(ford2);
		cars.add(car);

		for (Car supercar : cars) {
			System.out.println(supercar.getClass().getSimpleName() +
					"\t" + supercar.getSalePrice() + "$");
		}

	}

}
