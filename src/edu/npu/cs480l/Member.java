package edu.npu.cs480l;


public class Member extends Store{
	
//	 -Members - sub class
//	  (member_name, join_date, expire_date, address)
	 private String member_name;
	 private String join_date;
	 private String expire_date;
	 private String address;
	 
	 public Member(){
		 member_name 	= "Michelle";
		 join_date		= "December 1st, 2010";
		 expire_date 	= "December 1st, 2015";
		 address 		= "San Jose, CA";
	 }
	 
	 public Member(String get_member_name, String get_join_date, String get_expire_date, String get_address){
		 member_name 	= get_member_name;
		 join_date		= get_join_date;
		 expire_date 	= get_expire_date;
		 address 		= get_address;
	 }


	public String getMemberName() {
		return member_name;
	}

	public void setMemberName(String member_name) {
		this.member_name = member_name;
	}

	public String getJoinDate() {
		return join_date;
	}

	public void setJoinDate(String join_date) {
		this.join_date = join_date;
	}

	public String getExpireDate() {
		return expire_date;
	}

	public void setExpireDate(String expire_date) {
		this.expire_date = expire_date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		super.getInformation();

		System.out.println("Member Name: " + getMemberName());
		System.out.println("Join Date: " + getJoinDate());
		System.out.println("Expire Date: " + getExpireDate());
		System.out.println("Address: " + getAddress());
	}
}