package quiz01;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		//힌트 - 3항연산식을 쓴다.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("바구니 크기 입력>");
		int bucket = scan.nextInt();
		
		System.out.print("사과의 개수 입력>");
		int apple = scan.nextInt();
		
		int result = apple % bucket == 0 ? apple/bucket : apple/bucket+1; 
		
		
		System.out.println("사과개수:" + apple);
		System.out.println("바구니 개수:" + result + "개 필요해요" );
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}
}
