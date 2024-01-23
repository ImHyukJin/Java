package day08.poly.basic;
/*
 * 자바에서 하나의 클래스 파일에 여러 클래스 선언이 가능합니다.
 * 단, 파일명과 동일한 클래스가 존재해야 하고, 해당 클래스만 public이어야 합니다.
 */
class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {
	/*
	 * 다형성 - 객체가 다양한 형태를 가지는 성질
	 * -> 자식 객체가 부모타입을 가질 수 있는 성질
	 */
	A a = new A(); 
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A a1 = b; //B -> A타입으로 자동형변환
	A a2 = new B();
	A a3 = new C();
	A a4 = new D();
	A a5 = new E();
	
	int x = 1;
	double y = x; //int -> double 자동형변환
	
	//상속관계가 없다면 다형성이 불가능합니다.
	//B b2 = new E();
	
	//Object타입에는 무엇이든 저장된다? yes
	Object o1 = new A();
	Object o2 = new C();
	Object o3 = "문자열도 됩니다";
	Object o4 = 1;
	Object o5 = 3.14;
	
	
	
	
	
	
	
	
	
	
}
