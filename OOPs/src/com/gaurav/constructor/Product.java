package com.gaurav.constructor;

public class Product 
{
	int productId;
	String productName;
	double productPrice;
	int productQuantity;
	
	Product(int productId, String productName, double productPrice, int productQuantity)
	{
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}
	
	Product(Product p)
	{
		this.productId = p.productId;
		this.productName = p.productName;
		this.productPrice = p.productPrice;
		this.productQuantity = p.productQuantity;
	}
	
	void display()
	{
		System.out.println("Product ID       : " + productId);
		System.out.println("Product Name     : " + productName);
		System.out.println("Product Price    : ₹" + productPrice);
		System.out.println("Product Quantity : " + productQuantity);
		System.out.println("--------------------------------");
	}
	
	public static void main(String[] args)
	{
		Product p1 = new Product(101, "Laptop", 80000, 5);
		Product p2 = new Product(102, "Mobile", 25000, 10);
		Product p3 = new Product(103, "Headphones", 3000, 20);
		Product p4 = new Product(104, "Keyboard", 1500, 15);
		Product p5 = new Product(105, "Mouse", 800, 25);
		
		Product p = new Product(p1);
		
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		p5.display();
		
		p.display();
	}
}