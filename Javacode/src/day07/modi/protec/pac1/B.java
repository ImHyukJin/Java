package day07.modi.protec.pac1;

public class B {

	public B() {
		//같은 패키지 접근 허용
		A a = new A();
		a.bool = false;
		a.method();
		
	}
}
