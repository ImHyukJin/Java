package Interface;
//dummy 클래스로 임시 제작
class CalculatorDummy2 implements Calculatable{
	public void setOprands(int first,int second,int third) {}
	public int sum() {
		return 0;
	}
	public int avg() {
		return 1;
	}
}

public class CalculatorConsumer {

	public static void main(String[] args) {
		CalculatorDummy2 c = new CalculatorDummy2() ;
		c.setOprands(10, 20, 30);
		System.out.println(c.sum()+c.avg());
	}
}
