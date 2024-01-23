package day01;

public class Operation05 {

	public static void main(String[] args) {
		
		//3항 연산식
		//랜덤한 값을 만드는 기능
		
		//System.out.println( Math.random()   ); //0이상~1미만
		int d = (int)(Math.random() * 10) + 1;	//1~10의 랜덤한 정수값	
		System.out.println(d);
		System.out.println(d % 3 == 0 ? "3의 배수입니다" : "3의 배수가 아닙니다");
		
		
		//변수
		String s = d % 3 == 0 ? "3의 배수입니다" : "3의 배수가 아닙니다";
		System.out.println(s);
		
		
		
		//Math.random() 이용해서 -5~5 까지 랜덤한 정수를 생성
		//반드시 절대값만 나올 수 있도록 3항연산식을 작성해보세요.
		
		int r = (int)(Math.random() * 11) - 5;
		
		System.out.println("랜덤값r:" + r);
		System.out.println("절대값:" + (r < 0 ? -r : r)  );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
