package module1;
import java.util.*;
public class Product {
	private Integer id;
	private String name;
	private Double purchasedPrice;
	private Double salesPrice;
	private String grade;
	public Product(Integer id,String name,Double purchasedPrice,Double salesPrice,String grade) throws PriceException,EssentialCommodityException,GradeMismatchException {
		if(salesPrice<=purchasedPrice) {
			throw new PriceException("Sales Price must be higher than purchased price");
		}
		if(grade.equals("E")&&salesPrice>(1.25*purchasedPrice)) {
			throw new EssentialCommodityException("Sales price can't be more than 25% of purchasedPrice");
		}
		if(!(grade.equals("E")|| grade.equals("N"))) {
			throw new GradeMismatchException("grade can either be E or H");
		}
		this.id=id;
		this.name=name;
		this.purchasedPrice=purchasedPrice;
		this.salesPrice=salesPrice;
		this.grade=grade;
	}
		int getId() {
		return this.id;
	}
	
	String getName() {
		return this.name;
	}
	
	Double getPurchasedPrice() {
		return this.purchasedPrice;
	}
	Double getsalesPrice() {
		return this.salesPrice;
	}
	
	String getGrade() {
		return this.grade;
	}
	@Override
    public String toString() {
    	return String.format("%-5s %-20s %-10s %-5s",id,name,purchasedPrice,salesPrice,grade);
    }
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Product)) {
			return false;
		}
		Product other=(Product) obj;
		return id.equals(other.id);
	}

}
class PriceException extends Exception{
	public PriceException(String message) {
		super(message);
	}
	
}
class EssentialCommodityException extends Exception{
	public EssentialCommodityException(String message) {
		super(message);
	}
}
class GradeMismatchException extends Exception{
	public GradeMismatchException(String message) {
		super(message);
	}
}

