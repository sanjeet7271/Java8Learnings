package PredictExample;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Product_Predicts {

	Predicate<Product> priceGreater = p -> p.getPrice() > 1000;
	Predicate<Product> category=c->c.getCategory().equalsIgnoreCase("Electronics");
	Predicate<Product> priceLess = p -> p.getPrice() < 1000;

	public Predicate<Product> isPriceGreater() {
		return priceGreater;
	}
	public Predicate<Product> isCategory(){
		return category;
	}
	
	public Predicate<Product> isPriceAndCategory(){
		return priceGreater.and(category);
	}
	
	public Predicate<Product> isPriceOrCategory(){
		return priceGreater.or(category);
	}
	
	public Predicate<Product> isPriceLess(){
		return priceLess.and(category);
	}

	public List<Product> filterProducts(List<Product> product, Predicate<Product> predicate) {
		return product.stream().filter(predicate).collect(Collectors.toList());
	}

}
