package Inheritance;
//상속과 생성자
//매개변수가 있을 때는 자동으로 기본 생성자를 만들어주지 않는다.
//매개변수를 쓸 때에는 기본생성자를 먼저 추가하고,아래 매개변수를 쓴다.
public class Inheritance_constructor1 {
	public Inheritance_constructor1() {}  //이게 없이 매개변수만쓰이면 생성자에러
	public Inheritance_constructor1(int param1) {}	//이걸 쓰면서 생성자를 쓸거면 기본생성자 먼저생성
	public static void main(String[] args) {
		Inheritance_constructor1 Ic = new Inheritance_constructor1() ;
	}


}

