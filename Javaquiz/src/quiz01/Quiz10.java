package quiz01;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		//어떤 수를 입력 받습니다. - 입력한 수의 약수의 합계 출력
		//10 을 입력받으면 1, 2, 5, 10 = 18
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int a = scan.nextInt();
		
		
		int i = 1;
		int sum = 0; //누적변수
		
		while(i <= a) { //입력받은 수까지 회전
			//조건 생각하고 합계구함
			if(a % i == 0) {
				System.out.println(i);
				sum += i;
			}
			i++;
		}
		System.out.println(a + "까지 약수의 합: " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
