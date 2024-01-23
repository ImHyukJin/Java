package day07.modi.member.pac1;

public class A {

	//생성자에 접근제어자
	public A(int i) {}
	A(boolean b) {}
	private A(String s) {}
	
	//---------------------------------------------------
	//멤버변수와 메서드에 붙는 접근제어자
	
	public int var1;
	int var2;
	private int var3;
	
	public void method01() {}
	void method02() {}
	private void method03() {}
	
	public A() {
		//A에서는 모두 접근 가능
		this.var1 = 1;
		this.var2 = 2;
		this.var3 = 3;
		
		method01();
		method02();
		method03();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
