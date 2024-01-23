package Inheritance; //상속

class Calculator {
	int left , right ;
	
	public void setOprand(int left, int right) {
		this.left = left ;
		this.right = right ;
	}
	public void sum() {
		System.out.println(left + right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}
}
//상속
class SubstractionableCalculator extends Calculator { //자식-sub)extends (부모-super)
//빼기 클래스를 하위로 생성
	public void substraction() { //메소드 생성
		System.out.println(left-right);
	}
}
class MultiplicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(left * right);
	}
}

class DivisionableCalculator extends MultiplicationableCalculator{ //상속의 상속
	public void division() {
		System.out.println(left / right);
	}
}
public class Inheritance1 {

	public static void main(String[] args) {
		
		SubstractionableCalculator c1 = new SubstractionableCalculator() ;
		c1.setOprand(10,20) ;
		c1.sum();
		c1.avg();
		c1.substraction();
		
		MultiplicationableCalculator c2 = new MultiplicationableCalculator() ;
		c2.setOprand(10, 20);
		c2.sum();
		c2.avg();
		c2.multiplication();
		
		DivisionableCalculator c3 = new DivisionableCalculator() ;
		c3.setOprand(10, 20);
		c3.sum();
		c3.avg();
		c3.multiplication();
		c3.division();
	}
}
