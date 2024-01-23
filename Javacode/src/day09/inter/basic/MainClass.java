package day09.inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스는 객체 생성을 할 수 없습니다.
		//Inter1 i1 = new Inter1();
		
		Basic b = new Basic();
		b.method01(); //
		
		//인터페이스는 부모 타입이 될 수 있습니다.
		Inter1 i1 = b;
		i1.method01(); //
		
		System.out.println("------------------------------");
		/*
		 * 인터페이스 타입으로 변환되면, 자식의 기능을 사용할 수 없습니다.
		 * 
		 * 다시 자식의 기능을 사용하고 싶다면, 형변환이 가능합니다.
		 */

		
		
		Basic bb = (Basic)i1;
		bb.method01();
		bb.method03();
		
		
		//default메서드
		bb.method04();
		Inter1.method03();
		
		
		
		
		
		
		
		
	}
}
