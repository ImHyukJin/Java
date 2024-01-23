package day04;

import java.util.Arrays;

public class MethodEx05 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int a = 10;
		
		System.out.println(arr); //주소값(배열이 실제로 만들어진 위치) 
		System.out.println(a); //값
		
		callByValue(a);
		System.out.println(a); //값이 변하지 않음
		
		callByReference(arr);
		System.out.println( Arrays.toString(arr)  ); //배열요소 변함
	}
	
	//개념적으로 이해
	static void callByValue(int a) {
		a = 100;
	}
	
	static void callByReference(int[] arr) {
		arr[0] = 100;
	}
	
	
	
	
	
	
	
	
	
	
}
