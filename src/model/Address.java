package model;

public class Address {
	
	private int pincode;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public void setState(String state) {
		this.state = state;
	}




	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}




	

}
