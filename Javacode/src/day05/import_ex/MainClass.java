package day05.import_ex; 

import java.util.Scanner;
//import day05.fruit.Apple; //패키지 선언부 밑, 클래스 위에 선언됩니다
//import day05.fruit.Orange;

import day05.fruit.*; //fruit 패키지에 있는 모든 클래스 임포트

public class MainClass {

	public static void main(String[] args) {
		
		Apple apple = new Apple();
		Orange orange = new Orange();
		Scanner scan = new Scanner(System.in);
		
		System.out.println(apple); //만들어져 있는 주소값
		System.out.println(orange);
		System.out.println(scan);
		
		int a = 1;
		System.out.println(a); //값
		
		String s = "sdf";
		
		
		
		
	}
}
