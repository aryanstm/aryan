package module1;

public class Assignment3File {
	public static void main(String[] args) {
		Car c = new Car("Creta","Hyundai");
		System.out.println(c.toString());
		LuxuryCar lc = new LuxuryCar("Benz","Mercedes",200);
		System.out.println(lc.toString());
	}
}
class Car{
	private String name,brand;
	public Car(String name,String brand) {
		this.name = name;
		this.brand = brand;
	}
	
	public String toString() {
		return "Name = "+name+",Brand = "+brand;
	}
}
class LuxuryCar extends Car{
	private int speed;
	public LuxuryCar(String name,String brand,int sp) {
		super(name,brand);
		this.speed = sp;
	}
	@Override
	public String toString() {
		return super.toString()+", Speed = "+this.speed;
	}
}
