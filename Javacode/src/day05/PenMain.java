package day05;

public class PenMain {

	public static void main(String[] args) {
		
		//펜 기능 쓰고 싶다면, 객체로 생성해야 합니다.
		Pen redPen = new Pen(); //객체 생성명령
		
		//기능을 사용하고 싶다면 참조연산자 . 을 사용합니다
		redPen.ink = "빨강";
		redPen.price = 1000;
		redPen.company = "교과서로 배우고 빨간펜으로 다지고";
		
		redPen.write();
		redPen.info();
		
		Pen bluePen = new Pen();
		bluePen.ink = "파랑";
		bluePen.price = 2000;
		bluePen.company = "동아제약";
		
		bluePen.write();
		bluePen.info();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
