package com.gaurav.constructor;

public class AnonymousClass 
{
	int productId;
	String productName;
	double productPrice;
	int productQuantity;
	
	AnonymousClass(int productId, String productName, double productPrice, int productQuantity)
	{
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		
		display();
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
		new AnonymousClass(101, "Laptop", 80000, 5);
		new AnonymousClass(102, "Mobile", 25000, 10);
		new AnonymousClass(103, "Headphones", 3000, 20);
		new AnonymousClass(104, "Keyboard", 1500, 15);
		new AnonymousClass(105, "Mouse", 800, 25);
	}
}
