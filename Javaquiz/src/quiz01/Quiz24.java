package quiz01;

import java.util.Arrays;

public class Quiz24 {

	public static void main(String[] args) {
		
		int[] arr = {100, 200, 300, 400, 500};
		//배열의 길이는 고정이라서 끝에 추가하는 작업이 불가.
		int value = 600;
		/*
		 * 배열의 끝에 600의 값을 추가하려고 합니다.
		 * 1. 새로운 배열 + 1 을 만든다.
		 * 2. 기존 배열의 값을 옴겨 담는다.
		 * 3. 마지막에 value를 추가한다.
		 */
		int[] newArr = new int[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length-1] = value; 
		
		System.out.println(Arrays.toString(newArr));
		System.out.println("------------------------------------");
		
		//이번에는 앞에다가 700을 추가하자^0^
		int[] arr2 = {10, 20, 30, 40, 50, 0 };
		
		//arr2[인덱스] = arr2[인덱스-1];
		for(int i = arr2.length-1; i > 0; i--) {
			arr2[i] = arr2[i-1];
		}
		arr2[0] = 700;		
		
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
		
		
		
	}
}
