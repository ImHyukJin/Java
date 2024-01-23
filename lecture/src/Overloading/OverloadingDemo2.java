package Overloading;
public class OverloadingDemo2 extends Overloading2 {
	void A (String arg1 ,String arg2) {
		System.out.println("sub class : void A(String arg1,String arg2");
	}
	void A() {System.out.println("sub class : void A()");} //overriding
	public static void main(String[] args) {
		OverloadingDemo2 od = new OverloadingDemo2() ;
		od.A(); //overriding -재정의 
		od.A(1);
		od.A("Asdf");
		od.A("afsd", "sadfnull"); //overloading
	}
}

//overriding 부모 클래스의 메소드의 동작방법을 변경,
//overloading 같은 이름,다른 매개변수의 메소드를 여러개 만든다.
