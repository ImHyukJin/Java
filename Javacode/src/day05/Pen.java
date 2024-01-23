package day05;

//설계도로 쓰는 클래스는 main이 없습니다.
public class Pen {

	//클래스의 속성 값 을 나타낼때 멤버변수(필드) 라고 부릅니다.
	String ink;
	int price;
	String company;
	
	void write() {
		System.out.println(ink + "색상 글씨를 씁니다");
	}
	
	String info() {
		
		System.out.println("===펜의 정보===");
		System.out.println("색상:" + ink);
		System.out.println("가격:" + price);
		System.out.println("제조사:" + company);
		
		return company;
	}
	
	
}
