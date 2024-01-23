package quiz01;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		//구구단 수를 입력받아서, 구구단 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요>");
		int n = scan.nextInt();
		
		System.out.println("구구단:" + n + "단");
		
		
		int a = 1;
		while( a <= 9) {
			
			System.out.println(n + " x " + a + " = " + n*a);
			
			a++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
