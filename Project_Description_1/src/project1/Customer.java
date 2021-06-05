package project1;

public class Customer {
	protected int maxage;
	protected int minage;
	protected String gender;
	protected String location;
	protected int time;
	public Customer() {}
	public int getMaxage() {
		return maxage;
	}
	public void setMaxage(int maxage) {
		this.maxage = maxage;
	}
	public int getMinage() {
		return minage;
	}
	public void setMinage(int minage) {
		this.minage = minage;
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
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	
	public Customer(int maxage, int minage, String gender, String location, int time) {
		this.maxage = maxage;
		this.minage = minage;
		
		
		this.gender = gender;
		this.location = location;
		this.time = time;
	}
	@Override
	public String toString() {
		return String.format("최소나이 : %d ~ 최대나이 : %d, gender: %s, location: %s, time: %d"
				,this.minage, this.maxage, this.gender, this.location, this.time);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Customer) {
			if(minage == ((Customer)obj).minage &&
					maxage == ((Customer)obj).maxage &&
					gender == ((Customer)obj).gender &&
					location == ((Customer)obj).location &&
					time == ((Customer)obj).time) {
				return true;
			}
		}
		return false;
	}
}
