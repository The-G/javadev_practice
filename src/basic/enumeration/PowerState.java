package basic.enumeration;

public enum PowerState { // 이렇게 enum을 지정해서 input 값을 고정해 버릴 수 있다!!!!!
	OFF("POWER OFF"), 
	ON("POWER ON"), 
	SUSPEND("WHAT THE..."); // 대문자로 주는것이
							// 관례이다!!

	private String description;

	private PowerState(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return getDescription();
	}
}
