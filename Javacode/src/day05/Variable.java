package day05;

public class Variable {

	//멤버변수는 객체로 생성될 때 자동 초기화 들어갑니다. 0, 0.0 false null
	int a;
	
	void printNum(int c) {
		int b = 1;
		
		System.out.println("멤버변수:" + a);
		System.out.println("지역변수:" + b);
		System.out.println("매개변수:" + c);
		
	}

	
	
	
}
