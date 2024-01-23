package quiz01;

public class Quiz13 {

	public static void main(String[] args) {
		
		System.out.println("거꾸로 실행되는 랜덤 구구단^0^");
		int dan = (int)(Math.random() * 8) + 2;
		
		System.out.println("구구단 " + dan + "단");
		for(int i = 9; i >= 1; i--) {
			System.out.println(dan + " x " + i + " = " + dan*i);
		}
		
		
		
		
	}
}
