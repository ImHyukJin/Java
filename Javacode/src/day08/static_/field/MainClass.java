package day08.static_.field;

public class MainClass {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;

		System.out.println("일반변수:" + c1.a);
		System.out.println("정적변수:" + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("일반변수:" + c2.a);
		System.out.println("정적변수:" + c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("일반변수:" + c3.a);
		System.out.println("정적변수:" + c3.b);
		
		//현재 c1.b 는 몇일까요? 
		//현재 c2.b 는 몇일까요? 
		System.out.println("현재c1.b:" + c1.b);
		System.out.println("현재c2.b:" + c2.b);
		
		//1. static변수 객체들 사이에서 동일한 값을 갖게 한다.
		//2. static변수는 객체 바깥에 생성되므로, 객체 생성 없이 접근이 가능합니다.
		//	 클래스명.변수명
		
		
		c3.b = 100;
		Count.b++;
		c1.b = 3;
		
		System.out.println( Count.b  ); //3
		
		
		
	}
}
