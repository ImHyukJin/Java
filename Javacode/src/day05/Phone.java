package day05;

public class Phone {

	//멤버변수
	String model;
	int price;
	String color;
	
	//생성자 - 생성자는 클래스이름과 대/소문자 까지 동일
	//	   - 반환유형은 적지 않습니다.
	Phone() {
		System.out.println("생성자 호출됨ㅋ");
		//멤버변수를 초기화 하는 역할
		model = "삼성갤럭시S30";
		price = 1000000;
		color = "red";
	}
	
	//생성자는 중복으로 여러개 만들 수 있습니다(생성자 오버로딩)
	//규칙 - 매개변수의 종류 or 매개변수 개수가 달라야 합니다.
	Phone(String pColor) {
		
		model = "펜텍 큐리텔";
		price = 200000;
		color = pColor;
	}
	
	Phone(String pColor, int pPrice) {
		
		model = "세로본능";
		price = pPrice;
		color = pColor;
		
	}
	
	Phone(int pPrice, String pColor) {
		
		model = "가로본능";
		price = pPrice;
		color = pColor;
	}
	
	//
	Phone(String pModel, int pPrice, String pColor) {
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	
	//만약, 개발자가 생성자를 직접 만들면, 기본생성자를 자동 생성하지 않습니다.
	//그래서 기본생성자도 같이 만들어 두는 편이 좋습니다.
	
	
	
	
	//메서드
	void info() {
		System.out.println("===휴대폰 정보===");
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
		System.out.println("색상:" + color);
	}
	
	
	
	
}
