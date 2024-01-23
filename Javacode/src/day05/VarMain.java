package day05;

public class VarMain {

	public static void main(String[] args) {
		
		Variable var = new Variable();
		
		//멤버변수는 클래스 외부에서 접근이 가능합니다 (값의 변경)
		//var.a = 100;
		System.out.println(var.a);
		
		var.printNum(200);
		
		
		
		
		
		
	}
}
