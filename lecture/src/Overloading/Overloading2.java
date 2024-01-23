package Overloading;

public class Overloading2 {
	void A() {System.out.println("void A()");}
	void A(int arg1){System.out.println("void A(int arg1)");}
	void A(String arg1){ System.out.println("void A(String arg1)");}
	//int A() {System.out.println("voidA()");} 에러 


	public static void main(String[] args) {
		Overloading2 od = new Overloading2() ;
		od.A();
		od.A(1);
		od.A("오버로딩");
	}
}

