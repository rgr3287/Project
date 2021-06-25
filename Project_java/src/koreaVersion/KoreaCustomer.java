package koreaVersion;

public class KoreaCustomer implements Comparable<KoreaCustomer>{

	int age;
	int out; // 분류 기준
	String gender;
	String location;
	String id;
	
	KoreaCustomer(){ //this(0, null, null, null);
		
	}
	
	KoreaCustomer(int age, String id, String gender, String location, int out){
		this.age = age;
		this.gender = gender;
		this.location = location;
		this.out = out;
		this.id = id;
	}
	
	public String toString () { 
		return 
		    "▶ 【ID】 " + id + " 【인터넷 사용시간】 "+ out + " 【나이】 " + age  
		+ "\n  【성별】 "+ gender + " 【지역】 "+ location;
	}
	
	@Override
	public int compareTo(KoreaCustomer c) {
		// TODO Auto-generated method stub
		if (out > c.out) return -1; 
		else if (this.out == c.out) return id.compareTo(c.id);
		else return 1;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int out) {
		this.out = out;
	}



	

	


}
