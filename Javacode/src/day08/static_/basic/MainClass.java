package day08.static_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1. 녹색 계산기 1개, 빨강색 계산기 1개 생성
		 * 2. 계산기 색상 확인
		 * 3. add(int a)메서드를 추가(result누적)
		 * 4. pi변수를 사용해서 원의 넓이
		 * 5. circle() 사용해서 원의 넓이
		 */
		
		Calculator cal1 = new Calculator();
		cal1.setColor("green");
		
		Calculator cal2 = new Calculator();
		cal2.setColor("red");
		
		System.out.println("1번계산기:" + cal1.getColor()  );
		System.out.println("2번계산기:" + cal2.getColor()  );
		
		
		//static변수, static메서드
		System.out.println("원의넓이:" + 3 * 3 * Calculator.pi );
		System.out.println("원의넓이:" + Calculator.circle(3)  );
		
		
		System.out.println("--------------------------------------");
		
		//정적초기화자는 클래스가 불려나올때 단 1번만 실행.
		
		//Computer com1 = new Computer(1000);
		//Computer com2 = new Computer(2000);
		//Computer com3 = new Computer(3000);
		
		System.out.println( Computer.company );
		
		
		
		
		
		
	}
}
