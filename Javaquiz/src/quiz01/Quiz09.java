package quiz01;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		//1. 어떤 수를 입력받고, 1에서~입력받은 수까지 합계를 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int a = scan.nextInt();
		
		int i = 1;
		int sum = 0; //합계변수
		
		while(i <= a) {
			sum += i;
			i++;
		}
		
		System.out.println("입력받은 수까지합:" + sum);
		
		System.out.println("--------------------------");
		//2. 1~100까지 정수 중에서 짝수만 가로로 출력
		int n = 1;
		while(n <= 100) {
			
			if(n % 2 == 0) {
				System.out.print(n + " ");
			}
			
			n++;
		}
		
		System.out.println(); //줄바꿈
		
		System.out.println("--------------------------");
		//3. 1000의 약수의 개수 출력
		
		int x = 1;
		int cnt = 0; //누적할 변수
		
		while(x <= 1000) {
			
			if(1000 % x == 0) {
				cnt++; //개수누적
			}
			x++;
		}
		
		System.out.println("1000의 약수의 개수:" + cnt);
		
		
		
		
		
		
		
	}
}
