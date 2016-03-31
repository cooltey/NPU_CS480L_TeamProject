package edu.npu.cs480l;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Brand extends Store{
	
	 // -Products - sub class
	 // (product_name, produce_date, price)
	 private String brand_name;
	 private String company_location;
	 private ArrayList<Product> products = new ArrayList<Product>();
	 
	 public Brand(){
		 brand_name 		= "Starbucks";
		 company_location	= "Seattle";
	 }
	 
	 public Brand(String get_brand_name, String get_company_location, ArrayList<Product> get_products){
		 brand_name 		= get_brand_name;
		 company_location	= get_company_location;
		 products			= get_products;
	 }

	public String getBrandName() {
		return brand_name;
	}

	public void setBrandNname(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getCompanyLocation() {
		return company_location;
	}

	public void setCompanyLocation(String company_location) {
		this.company_location = company_location;
	}
	
	public Product getProduct(int position) {
		try{
			return products.get(position);
		}catch(Exception e){
			System.out.println("No item information");
			return null;
		}
	}

	public void addProduct(Product get_product) {
		products.add(get_product);
	}
	

	public void removeProduct(int position) {
		products.remove(position);
	}
	
	public int getProductAmounts(){
		return products.size();
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		super.getInformation();

		System.out.println("Brand Name: " + getBrandName());
		System.out.println("Company Location: " + getCompanyLocation());
	}
}