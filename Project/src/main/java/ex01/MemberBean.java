package ex01;

public class MemberBean {
	   private String id;
	   private String pwd;
	   private String name;
	   private String birthday;
	   private String email;
	   private String zipcode;
	   private String address;
	   private String hobby[];
	   
	   public String getId() {
	      return id;
	   }
	   public void setId(String id) {
	      this.id = id;
	   }
	   public String getPwd() {
	      return pwd;
	   }
	   public void setPwd(String pwd) {
	      this.pwd = pwd;
	   }
	   public String getName() {
	      return name;
	   }
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getBirthday() {
	      return birthday;
	   }
	   public void setBirthday(String birthday) {
	      this.birthday = birthday;
	   }
	   public String getEmail() {
	      return email;
	   }
	   public void setEmail(String email) {
	      this.email = email;
	   }
	   public String getZipcode() {
	      return zipcode;
	   }
	   public void setZipcode(String zipcode) {
	      this.zipcode = zipcode;
	   }
	   public String getAddress() {
	      return address;
	   }
	   public void setAddress(String address) {
	      this.address = address;
	   }
	   public String[] getHobby() {
	      return hobby;
	   }

	   public void setHobby(String[] hobby) {
	      this.hobby = hobby;
	   }
}
