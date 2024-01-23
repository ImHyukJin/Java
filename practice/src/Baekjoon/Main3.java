package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//배열의 크기는 신경쓰지 않기
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		
		//현재 고객수가 몇명이 저장되어있는지 알기 위한 변수.
		int count = 0;
		
		qqq : while(true) {
			//메뉴
			System.out.println("[Info]-고객수: "+ count);
			System.out.println("[메뉴]1.추가, 2.전체보기, 3.정보검색, 4.정보수정, 5.정보삭제, 6.나가기");
			System.out.println("메뉴입력>");
			String menu = sc.next();
			
			switch(menu) {
			
			case"1" :
				System.out.println("==============고객 정보 입력============");
				/*
				 * 1.이름과,나이를 입력받고,배열에 순서대로 값을 저장합니다.
				 * 2. count값을 증가
				 */
				String a = sc.next();
				int b = sc.nextInt();
				nameList[count] = a ;
				ageList[count] = b ;
						count++;
				System.out.println("======================================");
				break;
			case"2" :
				System.out.println("==============전체 고객정보 출력===========");
				/*
				 * 1. 배열에 저장된 고객정보 "name~님의 나이는 age입니다"
				 * 
				 */
				for(int i = 0 ; i<count ; i++) {
					System.out.println(nameList[i]+"님의 나이는"+ageList[i]+"입니다");
				}
				System.out.println("======================================");
				break;
			case"3" :
				System.out.println("==============고객 정보 검색=============");
				/*
				 * 1.이름을 입력받기
				 * 2.배열에서 이름을 찾은 후에, "name님은 x번째에 있습니다"
				 * 						  "name~님의 나이는 age입니다"
				 * 3.혹시 찾는 이름이 없다면, "name님의 정보는 없습니다"
				 */
				String N = sc.next();
				boolean bool = false ;
				for(int i = 0 ; i<count ; i++) {
					if(nameList[i].equals(N)) {
						System.out.println(nameList[i]+"님은"+(i+1)+"번째에 있습니다");
						bool = true ;
						break;
					}
					if(bool) {
						System.out.println(N+"님의 정보는 없습니다");
					}
				}
				
				System.out.println("======================================");
				
				break;
			case"4" :
				
				System.out.println("==============고객 정보 수정============");
				/*
				 * 1.먼저 모든 name을 출력해서 볼 수 있게 처리
				 * 2.수정할 이름을 입력 받습니다.
				 * 3.해당 이름을 배열에서 찾은 후에,name,age를 다시 입력받습니다.
				 * 4.입력받은 name,age로 수정해주면 됩니다.
				 * 5.잘못 입력된 경우 "없습니다"라고 처리
				 */
				boolean bool1 = false;
				for(int i = 0 ; i<count ; i++) {
					System.out.print(nameList[i]+",  ");
				}
				System.out.print("찾을 이름을 입력하세요>");
				String Na = sc.next();
				for(int i = 0 ; i<count ; i++) {
					if(nameList[i].equals(Na)) {
						System.out.print("수정할 이름을 입력하세요>");
						String Cha=sc.next();
						nameList[i] = Cha ;
						System.out.print("수정할 나이를 입력하세요");
						int Nai=sc.nextInt();
						ageList[i] = Nai;
						bool1 = true;
					}
				}
				if(bool1) {
					System.out.println("수정완료되었습니다");
				}else 
				System.out.println("없다");
				
				System.out.println("======================================");
				break;
			case "5":
				System.out.println("==========고객 정보 삭제==========");
				for(int i = 0; i < count; i++ ) {
					System.out.println("이름:" + nameList[i] + "|");						
				}
				System.out.print("삭제할 이름을 입력해주세요>");
				String name3 = sc.next();
				for (int i = 0; i < count; i++) {
					if(nameList[i].equals(name3)) {
						for ( int j =i; j < count-1 ; j++) {
							nameList[j] = nameList[j+1];
							ageList[j] = ageList[j+1];
						}
					
					}
				}	
				count--;
				String[] newNmaeList = new String[nameList.length-1];
				int[] newageList = new int[ageList.length-1];
				for ( int i = 0; i < count - 1; i++) {
					newNmaeList[i] = nameList[i];
					newageList[i] = ageList[i];
				}
				
				break;
			case"6" :
				
				System.out.println("======================================");
				System.out.println("==============프로그램 종료==============");
				System.out.println("======================================");
				
				break qqq;
				//while탈출 하면 됩니다.
			default :
				System.out.println("================================");
				System.out.println("========메뉴는 숫자로 입력===========");
				System.out.println("================================");
				break;
			}
	
//			for(int i = 0 ; i<count ; i++) {
//				
//			System.out.print(nameList[i]+",   ");
//			}
//			System.out.println();
//			for(int i = 0 ; i<count ; i++) {
//			System.out.print(ageList[i]+",    ");
			}	
		}
	
	}

