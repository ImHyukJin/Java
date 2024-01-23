package day01;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		//2. 스캐너가 가지고 있는 기능을 이용해서 데이터를 받음
		System.out.print("이름을 입력>");
		String name = scan.next(); //문자열 입력받아서 변수에 저장
		
		System.out.print("나이를 입력>");
		int age = scan.nextInt();
		
		System.out.print("키를 입력>");
		double cm = scan.nextDouble();
		
		System.out.print("자기소개하세요>");
		scan.nextLine(); //엔터값을 소모시켜
		String intro = scan.nextLine(); //문자열 - 
		
		
		System.out.println("이름:" + name + ", 나이:" + age + ", 신장:" + cm);
		System.out.println("자기소개:" + intro);
		
		//스캐너 자원해제
		scan.close();
		
		
	}
}
