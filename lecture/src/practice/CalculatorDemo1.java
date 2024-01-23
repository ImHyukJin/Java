package practice;

class Calculator2 {
	static double PI = 3.14 ;  //static 들어가면 클래스 변수 
	static int base = 0 ; //값의 변경 사향을 모든 인스턴스가 공유 할 때
	int left, right ;

	
	public  void setOprand(int left,int right) {
		this.left = left ;
		this.right = right;
	}
	public  void sum() {
		System.out.println(left + right+base);
	}
	public  void avg() {
		System.out.println((left + right+base)/2);
	}
}
public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		Calculator2 c1 = new Calculator2() ;
		System.out.println(c1.PI); //인스턴스를 통해 PI에 접근
		
		Calculator2 c2 = new Calculator2() ;
		System.out.println(c2.PI); 
		
		System.out.println(Calculator2.PI); //클래스를 통해서 PI에 접근
		
		c1.setOprand(10, 20); 
		c1.sum(); //30출력
		
		c2.setOprand(20, 40);
		c2.sum(); //60출력
		
		Calculator2.base = 10 ;
		
		c1.sum(); //40출력
		c2.sum(); //70출력
		
		
		
	}
}
