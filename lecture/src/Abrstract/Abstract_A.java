package Abrstract;
//추상 메소드 -- 상속을 '강제'한다.
abstract class A {
	public abstract int b();
	//본체가 있는 메소드는 abstract 키워드를 가질 수 없다. 메소드에 {}가 없음
	//추상 클래스 내에서는 추상 메소드가 아닌 일반 메소드가 존재 할 수 있다.
	//public abstract int c() {System.out.println("hello") //오류가 뜬다 추상메소드에 본체인 {}가 있기에
	public void d() {
		System.out.println("world");
	}
}
//public class Abstract_A{
//	public static void main(String[] args) {
//		// A obj = new A(); 추상클래스를 인스턴스화 할 수 없다 구체적인 메소드 내용이 없기때문에
//	}
//}
// 해결하기 위해선 상속을 쓰면된다
class B extends A{
	public int b() {return 1;} // 메소드b 오버라이딩
}
public class Abstract_A{
	public static void main(String[] args) {
		B obj = new B();
		System.out.println(obj.b());
	}
}