package quiz01;

public class Quiz14 {

	public static void main(String[] args) {
		
		//1. 7~100까지 정수들에서 7의 배수를 가로로 출력
		for(int i = 7; i <= 100; i+=7) {
			System.out.print(i + " ");
		}
		System.out.println(); //줄바꿈
		
		
		//2. 50~100까지 두 수 사이의 합계 출력
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
			sum += i;
		}
		System.out.println("50-100까지합:" + sum);
		
		//3. 200까지 정수 중에서 4의 배수이면서, 8의 배수가 아닌 수 출력
		for(int i = 1; i <= 200; i++) {
			if(i % 4 == 0 && i % 8 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//4. ABCDEF....Z를 붙여서 출력 A = 65, Z = 90
		String str = "";
		for(char a = 'A'; a <= 'Z'; a++) {
			str += a;
		}
		System.out.println(str);
		
		System.out.println("--------------------------------");
		
		//배열의 요소중에서 짝수의 합계 -> 배열요소에 순서대로 접근 -> 짝수인지 확인해서 누적
		int[] arr = {23, 54, 34, 23, 22, 20, 30};
		
		int cnt = 0;
		for(int i = 0; i < arr.length; i++) {
			if( arr[i] % 2 == 0 ) {
				cnt += arr[i];
			}
		}
		
		System.out.println(cnt);
		
		
		
		
		
		
		
		
		
	}
}
