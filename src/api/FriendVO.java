package api;

public class FriendVO {
	private String phone;
	private int gender;
	private int age;
	
	public FriendVO(String phone, int gender, int age) {
		super();
		this.phone = phone;
		this.gender = gender;
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "FriendVO [phone=" + phone + ", gender=" + gender + ", age=" + age + "]";
	}
	
}
