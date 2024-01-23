package Inheritance;

class Calculator2 {
	int left,right;
	
//	public Calculator2() {
//		
//	}
	
	public  Calculator2(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	
	
	public void setOprand(int left, int right) {
		this.left = left ;
		this.right = right ;
	}
	public void sum() {
		System.out.println(this.left + this.right);
	}
	public void avg() {
		System.out.println((this.left + this.right)/2);
	}
}
class SubstractionableCalculator2 extends Calculator2 {
	public SubstractionableCalculator2(int left, int right) { //생성자 클래스 이름 같아야댐
		super(left,right); //super ()부모클래스의생성자 <자식클래스보다 먼저나타나야됨
		//부모 기본생성자 없어도 오류가 안난다
		//		this.left = left;
		//		this.right = right;
	}
	public void substract() {
		System.out.println(left-right);
	}
	
}

public class Inheritance_constructor2 {

	public static void main(String[] args) {
		SubstractionableCalculator2 c1 = new SubstractionableCalculator2(10,20);
		c1.sum();
		c1.avg();
		c1.substract();
	}
}
