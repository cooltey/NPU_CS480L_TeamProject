package edu.npu.cs480l;

import java.util.ArrayList;

public class OpenStore {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//		Student ID: 18841
		//		Student Name: Feng, Pi-Hao

		
		// welcome
		System.out.println("Open Store!");
		System.out.println("========================");
		
		
		// store information
		Store myStore = new Store();
		myStore.setStoreName("Corner Market");
		myStore.setLocation("Warm Spring Blvd, Fremont, CA");
		myStore.setOpenHours("09:00 - 23:00");
		
		// brand array list
		ArrayList<Brand> myBrands = new ArrayList<Brand>();
		for(int i = 1; i < 5; i++){
			// set brand
			Brand tmpBrand = new Brand();
			tmpBrand.setBrandNname("Brand No." + i);
			tmpBrand.setCompanyLocation((int)(Math.random()*100) + " Brand Lane, Fremont, CA");
			
			// set products
			for(int j = 1; j < ((int)(Math.random()*20)); j++){
				Product tmpProduct = new Product();
				tmpProduct.setProductName("Item No." + j);
				tmpProduct.setProduceDate("2015-11-2" + ((int)(Math.random()*9)));
				tmpProduct.setPrice("$" + (int)(Math.random()*100));
				
				// add into array
				tmpBrand.addProduct(tmpProduct);
			}
			
			
			// add into array
			myBrands.add(tmpBrand);
		}
		
		// employee information
		Employee myEmployee_1 = new Employee();
		myEmployee_1.setEmployeeName("Jack");
		myEmployee_1.setHireDate("2015-01-02");
		myEmployee_1.setSalary("$25000");
		
		Employee myEmployee_2 = new Employee();
		myEmployee_2.setEmployeeName("Tom");
		myEmployee_2.setHireDate("2015-03-02");
		myEmployee_2.setSalary("$26000");

		Employee myEmployee_3 = new Employee();
		myEmployee_3.setEmployeeName("Mary");
		myEmployee_3.setHireDate("2015-03-02");
		myEmployee_3.setSalary("$26000");
		
		
		// Member information
		Member[] myMembers = new Member[(int) (Math.random()*10)];
		for(int i = 0; i < myMembers.length; i++){
			myMembers[i] = new Member();
			myMembers[i].setMemberName("Member Name " + (i + 1));
			myMembers[i].setJoinDate("2015-" + + ((int)(Math.random()*12)) + "-2" + ((int)(Math.random()*9)));
			myMembers[i].setExpireDate("2017-" + + ((int)(Math.random()*12)) + "-2" + ((int)(Math.random()*9)));
			myMembers[i].setAddress((int)(Math.random()*100) + "Somewehere Lane, San Francisco, CA");
		}
		
		
		// show store information
		System.out.println("Store Name: " + myStore.getStoreName());
		System.out.println("Open Hours: " + myStore.getOpenHours());
		System.out.println("Locations: " + myStore.getLocation());
		System.out.println("========================");
		System.out.println("Store Brands: " + myBrands.size());
		System.out.println("========================");
		for(int i = 0; i < myBrands.size(); i++){
			System.out.println("Brands Name: " + myBrands.get(i).getBrandName());
			System.out.println("Brands Location: " + myBrands.get(i).getCompanyLocation());
			System.out.println("Brands Products Amounts: " + myBrands.get(i).getProductAmounts());
			
			for(int j = 0; j < myBrands.get(i).getProductAmounts(); j++){

				System.out.println("Product Name: " + myBrands.get(i).getProduct(j).getProductName());
				System.out.println("Produce Date: " + myBrands.get(i).getProduct(j).getProduceDate());
				System.out.println("Product Price: " + myBrands.get(i).getProduct(j).getPrice());
			}

			System.out.println("========================");
		}
		

		System.out.println("========================");
		System.out.println("Emplyee 1 Name: " + myEmployee_1.getEmployeeName());
		System.out.println("Emplyee 1 Hire Date: " + myEmployee_1.getHireDate());
		System.out.println("Emplyee 1 Salary: " + myEmployee_1.getSalary());
		System.out.println("========================");
		System.out.println("Emplyee 2 Name: " + myEmployee_2.getEmployeeName());
		System.out.println("Emplyee 2 Hire Date: " + myEmployee_2.getHireDate());
		System.out.println("Emplyee 2 Salary: " + myEmployee_2.getSalary());
		System.out.println("========================");
		System.out.println("Emplyee 3 Name: " + myEmployee_3.getEmployeeName());
		System.out.println("Emplyee 3 Hire Date: " + myEmployee_3.getHireDate());
		System.out.println("Emplyee 3 Salary: " + myEmployee_3.getSalary());
		System.out.println("========================");
		

		System.out.println("========================");
		System.out.println("We Have " + myMembers.length + " Members");
		System.out.println("========================");
		for(int i = 0; i < myMembers.length; i++){
			Member getMember = myMembers[i];

			System.out.println("Member Name: " + getMember.getMemberName());
			System.out.println("Join Date: " + getMember.getJoinDate());
			System.out.println("Expire Date: " + getMember.getExpireDate());
			System.out.println("Address: " + getMember.getAddress());
			System.out.println("========================");
		}
	}
	
}


