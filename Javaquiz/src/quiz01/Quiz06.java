package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("[사칙연산을 하는 프로그램이에요]");
		
		System.out.print("정수1>");
		int n1 = scan.nextInt();
		
		System.out.print("연산을 선택하세요[+, -, *, /]>");
		String oper = scan.next();
		
		System.out.print("정수2>");
		int n2 = scan.nextInt();
		
		switch ( oper ) {
		case "+":
			System.out.println("두 수의 합:" + (n1 + n2));
			break;
		case "-":
			System.out.println("두 수의 뺄셈:" + (n1 - n2));
			break;
		case "*":
			System.out.println("두 수의 곱셈:" + (n1 * n2));
			break;
		case "/":
			System.out.println("두 수의 나누기:" + (n1 / n2));
			break;

		default:
			System.out.println("[+, -, *, /]를 입력해주세요.");
			break;
		}
		
		
		
		
		
		
		
	}
}
