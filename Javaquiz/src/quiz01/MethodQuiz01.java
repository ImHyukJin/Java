package quiz01;

import java.util.Arrays;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1();
		System.out.println( method2("홍길동")  );
		System.out.println( method3(1, 2, 3.14) );
		System.out.println( method4(10) );
		
		method5("a", 3);
		System.out.println(maxNum(1, 2) ); //2 리턴
		System.out.println(abs(-10) ); //10 리턴
	}
	//1
	static void method1() {
		System.out.println("안녕");
	}
	//2
	static String method2(String s) {
		return s;
	}
	//3.
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	//4.
	static String method4(int a) {
		
		if(a % 2 == 0) { //짝수
			return "짝수";
		} else { //홀수
			return "홀수";
		}
		
	}
	//5
	static void method5(String s, int a) {
		for(int i = 1; i <= a; i++) {
			System.out.println(s);
		}
	}
	//6
	static int maxNum(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
	//7
	static int abs(int x) {
		if(x > 0) {
			return x;
		} else {
			return -x;
		}
	}
	
	
	
	
	
	
}
