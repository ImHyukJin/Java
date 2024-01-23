package day09.inter.basic;

public interface Inter1 {

	//인터페이스는 상수, 추상메서드 +a(static, default)
	int A = 1; //자동으로 상수로 선언됩니다.
	void method01(); //자동으로 추상메서드가 됩니다.
	
	//static메서드도 선언이 됩니다.
	public static void method03() {
		System.out.println("static메서드 선언 가능");
	}
	//인터페이스에서 몸체를 가진 메서드 default
	public default void method04() {
		System.out.println("default메서드 선언 가능");
	}
	
	
	
	
	
	
	
	
}
