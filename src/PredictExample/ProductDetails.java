package PredictExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductDetails {
	
	public static void main(String[] args) {
		List<Product> product=new ArrayList<>();
		product.add(new Product("Cooler", 4500, "Electronics", "A"));
		product.add(new Product("Wire", 50, "Electronics", "A"));
		product.add(new Product("Rice", 5000, "Food", "F"));
		product.add(new Product("Fan", 2500, "Electronics", "A"));
		product.add(new Product("Chair", 300, "Fiber", "F"));
		product.add(new Product("Laptop", 45000, "Electronics", "A"));
		product.add(new Product("light", 80, "Electronics", "A"));
		product.add(new Product("Mobile COver", 150, "Electronics", "A"));
		product.add(new Product("Mobile", 10000, "Electronics", "A"));
		product.add(new Product("Medicine", 30, "Medical", "M"));
		product.add(new Product("Wifi", 2500, "Electronics", "A"));
		
		System.out.println("******************Price Greater than Rs. 1000 ***********************");
		Product_Predicts details = new Product_Predicts();
		List<Product> productLists = details.filterProducts(product, details.isPriceGreater());
		for (Product products : productLists) {
			System.out.println(products.getName() + " | " + products.getPrice() + " | " + products.getCategory() + " | "
					+ products.getGrade());
		}
		System.out.println("*********************Electronic Category*******************************");
		List<Product> categoryList = details.filterProducts(product, details.isCategory());
		for (Product category : categoryList) {
			System.out.println(category.getName() + " | " + category.getPrice() + " | " + category.getCategory() + " | "
					+ category.getGrade());
		}

		System.out.println(
				"*********************Price greater than Rs. 1000 and Electronic Category*******************************");
		List<Product> priceAndCategoryList = details.filterProducts(product, details.isPriceAndCategory());
		for (Product category : priceAndCategoryList) {
			System.out.println(category.getName() + " | " + category.getPrice() + " | " + category.getCategory() + " | "
					+ category.getGrade());
		}

		System.out.println(
				"*********************Price greater than Rs. 1000 or Electronic Category*******************************");
		List<Product> priceOrCategoryList = details.filterProducts(product, details.isPriceOrCategory());
		for (Product category : priceOrCategoryList) {
			System.out.println(category.getName() + " | " + category.getPrice() + " | " + category.getCategory() + " | "
					+ category.getGrade());
		}

		System.out.println(
				"*********************Price greater than Rs. 1000 or Electronic Category*******************************");
		List<Product> priceList = details.filterProducts(product, details.isPriceLess());
		for (Product category : priceList) {
			System.out.println(category.getName() + " | " + category.getPrice() + " | " + category.getCategory() + " | "
					+ category.getGrade());
		}
	}
}
