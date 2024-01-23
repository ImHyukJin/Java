package day09.inter.basic;

public class Basic implements Inter1, Inter2 {

	//클래스가 인터페이스를 상속받을 때는 implements 키워드를 씁니다.
	//클래스가 인터페이스를 구현한다(상속) 이라고 부릅니다.
	//인터페이스에 선언된 추상메서드는 자식에서 반드시 오버라이딩 되야합니다.
	
	@Override
	public void method01() {
		System.out.println("오버라이드 된 메서드 1번");
	}
	
	public void method03() {
		System.out.println("basic의 메서드 3번");
	}

	@Override
	public void method02() {
		System.out.println("오버라이드 된 메서드 2번");
	}
	
	
	
	
}
