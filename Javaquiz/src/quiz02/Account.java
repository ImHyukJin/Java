package quiz02;

public class Account {
//	1. 멤버 변수- 예금주이름(name : String), 비밀번호(password : String), 잔액(balance: int) 로 선언하세요.
//
//	2. 생성자 - 3가지 멤버 변수를 모두 매개값으로 받아 초기화하는 생성자를 선언하세요.
//
//	3. 메서드 - 
//			입금기능 메서드(deposit : void),  - 잔액누적
//	        출금기능 메서드(withDraw: void),  - 잔액차감
//			잔액 조회 메서드(getbalance: int) - 잔액리턴
	String name;
	String password;
	int balance;
	
	Account(String n, String pw, int bal) {
		name = n;
		password = pw;
		balance = bal;
	}
	//입금
	void deposit(int money) {
		balance += money;
	}
	//출금
	void withDraw(int money) {
		if(balance < money) {
			System.out.println("잔액 부족");
			return;
		}
		
		balance -= money;
	}
	//잔액조회
	int getBalance() {
		return balance;
	}
	
	
	
	
	
}
