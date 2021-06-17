package project1_add;

public class Customer implements Comparable<Customer>{
	public int age;
	public String id;
	public String location;
	public String gender;
	public int onlinetime;
	
	public Customer() {}
	public Customer(int age, String id, String location, String gender, int onlinetime) {
		this.age = age;
		this.id = id;
		this.location = location;
		this.gender = gender;
		this.onlinetime = onlinetime;
	}
	
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	public String getId(Customer o) {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getOnlinetime() {
		return onlinetime;
	}
	public void setOnlinetime(int onlinetime) {
		this.onlinetime = onlinetime;
	}
	
	@Override
	public String toString() {
		return String.format("나이: %d, ID : %s, 지역 : %s, 성별 : %s, 이용시간: %d 시간 ",
				this.age, this.id, this.location, this.gender, this.onlinetime);
	}
	@Override
	public int compareTo(Customer o) {	
		if(onlinetime < o.onlinetime) return -1;
		else if (onlinetime == o.onlinetime) return id.compareTo(o.id);	
		else return 1;
	}
	
	
	
	
}
