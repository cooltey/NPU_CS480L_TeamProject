package edu.npu.cs480l;


public class Product extends Brand{
	
	 // -Products - sub class
	 // (product_name, produce_date, price)
	 private String product_name;
	 private String produce_date;
	 private String price;
	 
	 public Product(){
		 product_name 	= "Pepsi";
		 produce_date	= "April 1st, 2016";
		 price 			= "$0.99";
	 }
	 
	 public Product(String get_product_name, String get_produce_date, String get_price){
		 product_name 	= get_product_name;
		 produce_date	= get_produce_date;
		 price 			= get_price;
	 }

	public String getProductName() {
		return product_name;
	}

	public void setProductName(String product_name) {
		this.product_name = product_name;
	}

	public String getProduceDate() {
		return produce_date;
	}

	public void setProduceDate(String produce_date) {
		this.produce_date = produce_date;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		super.getInformation();

		System.out.println("Product Name: " + getProductName());
		System.out.println("Produce Date: " + getProduceDate());
		System.out.println("Price: " + getPrice());
	}
}