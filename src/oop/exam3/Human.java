package oop.exam3;

public class Human {
	// java5 이후로는 private에 접근이 가능하다고 하네...
	// 그래서 무의미 하지만 일단 적용!!!	
	private String name;
	private int gender; // 1:남자 2:여자
	private int birth;
	private String job;
	private boolean married; // 미혼:true, 기혼:false
	private int weight;
	private int height;
	private String hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	@Override
	public String toString() { //toString을 
		return name + "회원님은" + whatGender() + "이며\n" + 
			   "출생년도는 " + birth + "년 이며 직업은" + job + "이고\n" +
			   whatMarried() + "이며 체중은" + weight + "이고\n" + 
			   "키는" + height + "취미는 " + hobby + " 입니다.";
	}
	private String whatMarried() {
		return married ? "미혼" : "기혼";
	}
	private String whatGender() {
		return gender == 1 || gender == 3 ? "남성" :
			   gender == 2 || gender == 4 ? "여성" :
				   						    "에러" ;
	}
	
	
	// 기존 클래스를 수정하는 것은 바람직하지 않다.
	// 확장을 하지.
	
}
