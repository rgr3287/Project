package project1;

public class likely extends Customer {
	public likely () {}
	
	public likely(int maxage, int minage, String gender, String location, int time) {
		
		super(maxage, minage, gender, location, time);
	}
	
	
	@Override
	public String toString() {
		return String.format("�ּҳ��� : %d ~ �ִ볪�� : %d, gender: %s, location: %s, time: %d"
				,this.minage, this.maxage, this.gender, this.location, this.time);
	}
}
