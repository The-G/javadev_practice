package oop.exam8;

public class Account {
	static int money1; // 한번 할당 받고 그 값이 고정되서 남아있네.
					   // static area에 Account, AcountTest Class와 함께 moeny1도 할당되어 있는다!! static 이니.
	int money2;
	
	public Account (int money) {
		money1 += money;
		money2 += money;
		
	}
}
