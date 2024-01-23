package quiz01;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
		int result = sum(10);
		System.out.println("약수의 합:" + result);
		
		System.out.println( sum2(1, 10) );
		System.out.println( sum2(10, 1) );
		System.out.println( sum2(10, 10) );
		
		System.out.println( java(4));
		
		
	}
	//1. 매개변수 n을 받아서, n까지 약수의 합을 리턴하는 sum() 생성
	static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}

	//2. 두 수를 매개변수로 받아서, 두 수사이의 합 리턴 sum2() 생성
	//	 > 두 수의 크기는 정해지지 않음 
	//   > sum2(1, 10)
	//   > sum2(10, 1)
	static int sum2(int a, int b) {
		
		int max = a > b ? a : b;
		int min = a > b ? b : a;
		
		int sum = 0;
		for(int i = min; i <= max; i++) {
			sum += i;
		}
		
		return sum; 
	}
	//1. java 함수 는 매개변수 로 숫자를 받습니다.
	//2. 매개변수 숫자길이만큼 패턴 "자바자바자바..."를 리턴 하는 함수를 완성하세요
	//1이면 자
	//2이면 자바
	//3이면 자바자
	//4이면 자바자바
	static String java(int n) {
		String str = "";
		for(int i = 1; i <= n; i++) {
			//str = i % 2 == 0 ? (str+="바") : (str+="자");
			if(i % 2 == 0) {
				str += "바";
			} else {
				str += "자";
			}
		}
		
		return str;
	}
	
	
	
	
}
