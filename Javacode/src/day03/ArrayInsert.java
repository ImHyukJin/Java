package day03;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] newArr = new int[arr.length+1];
		
		//중간에 추가 - target인덱스에 data를 추가하는 프로그램코드 작성.
		int data = 100; //추가할 값
		int target = 2; //추가할 위치
		
		/*
		 * 1. 배열을 newArr 옴겨담는다.
		 * 2. 마지막부터 ~ 타겟까지 배열을 당긴다.
		 * 3. target에 data를 넣는다.
		 */
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		//배열을 뒤에서 당기는 작업
		for(int i = newArr.length-1; i > target; i--) {
			newArr[i] = newArr[i-1];
		}
		//중간에 값을 넣는작업
		newArr[target] = data;
		
		System.out.println(Arrays.toString(newArr));
		
		
		
	}
}
