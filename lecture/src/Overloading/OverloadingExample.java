package Overloading;
class Calculator5 {
	int[] oprands ;
	
	public void setOprands(int[] oprands) {
		this.oprands = oprands ;
	}
	
	public void sum() {
		int total = 0;
		for(int value : this.oprands) { // for each 구문
			total += value ;
		}
		System.out.println(total);
	}
	public void avg() {
		int total = 0;
		for(int value : this.oprands) {
			total += value;
		}
		System.out.println(total/this.oprands.length);
	}
}
public class OverloadingExample {
	public static void main(String[] args) {
		Calculator5 c1 =new Calculator5();
		c1.setOprands(new int[] {10,20});
		c1.sum();
		c1.avg();
		c1.setOprands(new int[] {10,20,30,100,70});
		c1.sum();
		c1.avg();
	}
}
