package report;

public class Ford extends Car {
	private int year;
	private int manufactureDiscount;

	public Ford(int speed, double regularPrice, String color, int year, int manufactureDiscount) {
		super(speed, regularPrice, color);
		this.manufactureDiscount = manufactureDiscount;
		this.year = year;
	}

	public double getSalePrice() {
		return super.getRegularPrice() - manufactureDiscount;
	}

}
