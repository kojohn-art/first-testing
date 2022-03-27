package report;

public class Sedan extends Car{
	private int length;
	public Sedan(int speed, double regularPrice, String color,int length) {
		super(speed, regularPrice, color);
		// TODO Auto-generated constructor stub
		this.length =length;
	}
//	public double getSalePrice() {
//		return this.getRegularPrice()*(length>20?0.95:0.9);
//		
//	}
	
	public double getSalePrice() {
		double result;
		if(length>20) {
			result = this.getRegularPrice()*0.95;
		}else {
			result = this.getRegularPrice()*0.9;
		}return result;
		
	}

}
