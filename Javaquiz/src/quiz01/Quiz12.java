package quiz01;

public class Quiz12 {

	public static void main(String[] args) {
		
		/*
		 * 1. 배열에 순서대로 접근
		 * 2. money의 몫 구함
		 * 3. 원래 money를 나머지를 저장한다.
		 */
		
		
		//자판기
		//동전
		int[] arr = {1000, 500, 100, 50, 10 };
		//잔돈
		int money = 17780; //1000원짜리 17, 500짜리 1개, 100원 2개, 50원 1개, 10원 30개
		
		int i = 0;
		while(i < arr.length) {
			
			System.out.println(arr[i] + "원:" + money / arr[i]);
			money %= arr[i]; //money = money % 1000
			
			i++;
		}
		
		
		
		
		
		
		
		
	}
}
