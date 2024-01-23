package day08.poly.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method01(); //상속받은 메서드
		child.method02(); //오버라이드 된메서드
		child.method03(); //자식의 메서드
		
		System.out.println("-----다형성 적용-----");
		//부모님이 가진 메서드만 사용가능함
		//단, 오버라이딩 된 메서드는 먼저 실행됩니다.
		//Parent p = new Child();
		Parent p = child;
		
		p.method01();
		p.method02(); //오버라이딩 된 메서드
		//p.method03();
		
		System.out.println(p);
		System.out.println(child);
		System.out.println(p == child); //같음 -> 일시적으로 부모타입으로 변환
		
		
		System.out.println("--------클래스 형변환--------");
		/* 
		 * 다형성으로 객체 형변환이 일어나면, 자식 타입의 메서드를 사용할 수 없는 문제가 발생.
		 * 
		 * 클래스 캐스팅() - 다시 원래 타입으로 변환이 가능합니다.
		 */
		System.out.println(p);
		Child cc = (Child)p; //p는 다형성이 적용 되었던 변수
		cc.method01();
		cc.method02();
		cc.method03();
		
		//////////////////////////////////////////
		//다형성이 일어나지 않은 객체를 대상으로 형변환을 하면 에러가 발생합니다.
		Object o = new Object(); //o는 String의 s도 없는친구
		System.out.println(o);
		String s = (String)o;
		
		
		
		
		
		
		
		
		
	}
}
