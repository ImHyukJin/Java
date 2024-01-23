package Overriding;
class Calculator {
	int left, right;

	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}

	public void sum() {
		System.out.println(this.left + this.right);
	}

	public int avg() { // int로 나오면 return값으로
		return((this.left + this.right) / 2);
	}
}

class SubstractionableCalculator extends Calculator {

	public void sum() {
		System.out.println("실행결과는 " + (this.left +this.right) + "입니다");
		//상속 받은 클래스를 하위클래스에서 변경하면 변경된 값으로 나온다.
	}
	//	public int avg() {
	//		reutrn((this.left + this.right)/2);
	//	}
	// overriding 하기 위해 메소드의 리턴 형식이 같아야한다. Calculator 메소드 avg는 void타입,
	//SubstractionableCalculator의 리턴타입은 int타입이다
	/* overriding을 위한 조건은
	 * 메소드의 이름 (여기선 avg)
	 * 메소드 매개변수의 숫자와 데이터 타입 그리고 순서 (숫자 2개 left right / void / 순서)
	 * 메소드의 리턴타입
	 * 이것들을 합쳐 메소드의 '서명'이라고 한다.
	 * 부모의 타입을 void->int로 바꿔도된다
	 */
	//super 사용
	public int avg() {
		return super.avg();
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class Overriding1 {
	public static void main(String[] args) {

		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		System.out.println("실행결과는 : " + c1.avg() +"입니다");
		c1.substract();
	}

}
