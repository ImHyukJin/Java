package day04;

import java.util.Arrays;

public class MethodEx08 {

	public static void main(String[] args) {
		
		//Queue - FIFO (First In First Out)
		
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i <= 5; i++) {
			System.out.println( pop() );
			System.out.println( Arrays.toString(arr) );
			
		}
		
		
	}
	
	static int[] arr = {};
	
	//추가
	static void push(int data) {
		
		//1. 배열 크기 +1 새로운 배열 생성
		int[] temp = new int[arr.length + 1];
		//2. 배열 요소 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//3. 마지막 추가
		temp[temp.length-1] = data;
		//4. 원본 배열을 temp로 변경
		arr = temp;
		temp = null;
	}
	//삭제
	static int pop() {
		
		if(arr.length > 0 ) {
			//1. 삭제할 데이터를 백업 (가장 첫번째 요소)
			int del = arr[0];
			//2. arr - 1 사본배열 생성
			int[] temp = new int[arr.length-1];
			//3. 원본 배열의 첫번째~마지막요소 까지 옴겨담는다.
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1];
			}
			//4. 원본 배열을 temp로 변경
			arr = temp;
			temp = null;
			
			return del; //1번 반환
		}
		
		
		return 0;//
	}
	
	
	
	
}
