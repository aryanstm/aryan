package module1;

import java.util.HashSet;

public class exceptionhandling {
	public static void main(String[] args) {
		
		
		HashSet<Product> products= new HashSet<Product>();
		try {
			products.add(new Product(1001,"Salt",20.00,22.00,"E"));
			products.add(new Product(1002,"Biryani Masala",45.00,55.00,"N"));
		}
		catch(PriceException|EssentialCommodityException|GradeMismatchException e){
			System.out.println(e.getMessage());
		}
		for(Product p:products) {
			System.out.println(p);
		}
		
		}
}
