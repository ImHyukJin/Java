package day08.static_.method;

public class Count {

	
	public int a; //일반변수
	public static int b; //정적변수
	
	//일반메서드 - 일반변수, 정적변수 모두 사용이 됩니다.
	public int method() {
		a = 10;
		b++;
		return b;
	}
	
	//정적메서드 - static멤버반 사용이 됩니다.
	public static int method2() {
		//a = 10; //- 단, 방법이 있죠
		//객체를 생성해서는 접근이 됩니다.
		Count c = new Count();
		c.a = 10;
		
		b++;
		return b;
	}
	
	
	
	
	
	
	
	
	
	
}
