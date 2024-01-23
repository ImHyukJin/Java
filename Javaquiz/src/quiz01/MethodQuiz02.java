package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		//두 수를 입력받아서 두 수의 합을 구하세요.
		/*
		//print() 
		System.out.println("두 정수를 입력하세요!");
		
		//input() - 메서드 내부에서 입력을 받아서 리턴하는 메서드로 변경(x2)
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num1 = scan.nextInt();
		System.out.print(">");
		int num2 = scan.nextInt();

		//add() - 두 수의 합을 더해서 결과를 리턴
		int result = num1 + num2;
		
		//result() - 결과를 받아서 출력.
		System.out.println("두 수의 합:" + result);
		*/
		
		print();
		int num1 = input();
		int num2 = input();
		int result = add(num1, num2);
		result(result);
		
	}
	
	static void print() {
		System.out.println("두 정수를 입력하세요!");
	}
	
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num = scan.nextInt();
		
		return num;
	}
	
	static int add(int a, int b) {
		return a + b;
	}
	
	static void result(int result) {
		System.out.println("두 수의 합:" + result);
	}
	
	
	
	
	
}
