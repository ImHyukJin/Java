package Abrstract;

abstract class Calculator {
	int left,right;
	
	public void setOprand(int left, int right) {
		this.left=left;
		this.right=right;
	}
	public abstract void sum();
	public abstract void avg();
	public void run(){ // sum,avg 는 반복이니 메소드로 만들자.
		sum();
		avg();
	}
}
class Calculator1 extends Calculator{
	public void sum() { //sum 오버라이딩
		System.out.println("+sum"+(this.left+this.right));
	}
	public void avg() { // avg 오버라이딩
		System.out.println(("+avg"+(this.left+this.right)/2));
	}
}
public class Abstract_Example {
	public static void main(String[] args) {
		
		Calculator1 c1 = new Calculator1();
		c1.setOprand(10, 20);
		c1.run();
		
		Calculator1 c2 = new Calculator1();
		c2.setOprand(20, 40);
		c2.run();
		
	}
}