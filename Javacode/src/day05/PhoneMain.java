package day05;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone red = new Phone();
		red.info();
		
		Phone black = new Phone("black");
		black.info();
		
		Phone blue = new Phone("blue", 100000);
		blue.info();
		
		Phone white = new Phone(50000, "white");
		white.info();
		
		//모든 멤버변수를 받을 수 있는 Phone생성자
		//여러분이 갖고 싶은 핸드폰으로 객체 생성
		
		Phone myPhone = new Phone("아이폰15Pro", 100000, "black");
		myPhone.info();
		
		
		
		
		
		
		
	}
}
