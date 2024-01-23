package Interface;
//찐 Calculator 받고 변환

class Calculator implements Calculatable {
	int first, second, third;
	public void setOprands(int first,int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	public int sum() {
		return this.first+this.second+this.third ;
	}
	public int avg() {
		return (this.first+this.second+this.third)/3;
	}
}


public class CalculatorConsumer2 {

	public static void main(String[] args) {
		Calculator c = new Calculator(); //dummy 해제하고 받으려던 Calculator 적용
		c.setOprands(20, 20, 30);
		System.out.println(c.sum()+c.avg());
	}
}
