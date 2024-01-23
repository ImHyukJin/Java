package day08.static_.basic;

public class Computer {

	public static String company;
	public int price;
	
	//정적 초기화자 - 단 1번만 실행됩니다.
	static {
		//this.company = "LG"; //this키워드 사용불가
		company = "LG";
		
		System.out.println("정적초기화자 1번 실행됨");
	}
	
	public Computer(int price) {
		this.price = price; //일반변수 초기화
		//this.company = "LG";
	}
	
}
