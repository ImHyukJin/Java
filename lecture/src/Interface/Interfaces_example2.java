package Interface;
class CalculatorDummy{
	public void setOprands(int first,int second,int third) {}
		public int sum() {
			return 60;
		}
		public int avg() {
			return 15;
		}
		
	}
	
public class Interfaces_example2 {
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
		c.setOprands(10, 20, 30);
		System.out.println(c.sum()+c.avg());
	}
}
