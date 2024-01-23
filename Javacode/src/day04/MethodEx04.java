package day04;

import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {
		
		//배열을 매개변수로 전달?
		String[] arr = {"월", "화", "수"};
		
		String result = func01(arr);
		System.out.println(result);
		
		//배열을 반환?
		int[] result2 = func02();
		System.out.println( Arrays.toString(result2) );
		
		//6
		char[] arr2 = {'a', 'b', 'c'};
		String result3 = method06(arr2);
		System.out.println(result3);
		
		//7
		int[] arr3 = {1,2,3,4,5};
		int result4 = method07(arr3);
		System.out.println(result4);
		
		//8
		String[] arr4 = method08("홍길동", "이순신");
		System.out.println( Arrays.toString(arr4) );
		
	}
	//배열을 매개변수로 받는다.
	static String func01(String[] arr) {
		
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		return str;
	}
	
	//배열을 반환하는 메서드
	static int[] func02() {
		
		int[] arr = {1,2,3};
		//내용...생략....
		
		return arr;
	}
	
	//6
	static String method06(char[] arr) {
		
		//문자열합
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
		}
		
		return str; 
	}
	//7
	static int method07(int[] arr) {
		
		int sum = 0;
		for(int a : arr) {
			sum += a;
		}
		return sum;
	}
	//8
	static String[] method08(String a, String b) {
		
		String[] arr = {a, b};
		
		return arr;
	}
	
	
	
	
	
}
