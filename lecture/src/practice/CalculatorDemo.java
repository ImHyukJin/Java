package practice;

class Calculator{ //class 생성
	int left, right; // 클래스 변수
	
	public void setOprands(int left, int right) { //메소드
		this.left = left ;
		this.right = right ;
	}
	public void sum() {
		System.out.println(this.left + right);//메소드
	}
	public void avg() {
		System.out.println((left + right)/2);//메소드
	}
	
}
public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator c1 = new Calculator() ; //인스턴스 생성 (c1)
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
	
		Calculator c2 = new Calculator() ;
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
		
	}
}
