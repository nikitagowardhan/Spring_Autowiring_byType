package model;

public class Student {
	
	private int id;
	private String sname;
	private Address add;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public void setAdd(Address add) {
		this.add = add;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", add=" + add + "]";
	}
	
	
	

}
