package Final;
//필드와 변수는 같은 의미, final은 실행되는 과정에서 값이 바뀌지 않도록하는 규제,상속도 불가
class Calculator {
	static final double PI = 3.14;
	int left,right ;
	
	public void setOprand(int left,int right) {
		
	this.left = left ;
	this.right = right ;
	}
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}
public class Final_Field {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		//Calculator.PI = 10; // finale로 지정되어 수 변경 불가 에러
	}
}