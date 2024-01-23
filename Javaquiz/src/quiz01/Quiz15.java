package quiz01;

import java.util.Arrays;

public class Quiz15 {

	public static void main(String[] args) {
		
		/*
		 * 절대 중복되지 않는 값을 가지고 있는 길이가 3인 배열만들기
		 * 
		 * 1. 랜덤수 2개를 생성해서, arr배열을 랜덤하게 10번 섞어줍니다.
		 * 2. 0~2번째 인덱스 값을 가지는 새로운 배열로 옴겨담아보세요.
		 * 
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9 }; 
		
		for(int i = 1; i <= 10; i++) {
			
			int ran = (int)(Math.random() * arr.length );
			int ran2 = (int)(Math.random() * arr.length );
			//배열의 자리를 바꾸는 작업
			int tmp = arr[ran];
			arr[ran] = arr[ran2];
			arr[ran2] = tmp;

		} 
		
		//새로운배열로 옴기기
		int[] newArr = new int[3];
		for(int i = 0; i < newArr.length; i++ ) {
			newArr[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		
		
		
		
		
		
		
		
	}
}
