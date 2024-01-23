package day01;

public class Casting01 {

	public static void main(String[] args) {
		
		//1. 크기가 작은 타입을 큰 타입에 저장할 때는 자동으로 형변환이 일어납니다.
		//JVM이 자동 형변환 시킵니다.
		
		byte b = 10;
		
		short s = b; //byte -> short로 자동형변환
		int i = b;	 
		long l = b;
		
		
		char c = '가'; //2byte
		int j = c; //char -> int로 자동형변환
		
		System.out.println(j);
		
		int k = 1000;
		double d = k; //int -> double
			
		System.out.println(d);
		
		
		
		
		
		
		
		
		
		
		
	}
}
