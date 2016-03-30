package edu.npu.cs480l;


public class Store {
	
	 //	Store - main class
	 //	(store_name, open_hours, location)
	 String store_name;
	 String open_hours;
	 String location;
	 
	 public Store(){
		 store_name 	= "Corner Market";
		 open_hours		= "09:00 - 23:00";
		 location 		= "Warm Spring Blvd, Fremont, CA";
	 }
	 
	 public Store(String get_store_name, String get_open_hour, String get_location){
		 store_name 	= get_store_name;
		 open_hours		= get_open_hour;
		 location 		= get_location;
	 }

	public String getStoreName() {
		return store_name;
	}

	public void setStoreName(String store_name) {
		this.store_name = store_name;
	}

	public String getOpenHours() {
		return open_hours;
	}

	public void setOpenHours(String open_hours) {
		this.open_hours = open_hours;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	 
	public void getInformation(){
		System.out.println("Store Name: " + getStoreName());
		System.out.println("Open Hours: " + getOpenHours());
		System.out.println("Locations: " + getLocation());
	}
}