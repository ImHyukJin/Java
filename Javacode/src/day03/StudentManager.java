package day03;

import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//배열의 크기는 신경쓰지 x
		String[] nameList = new String[100]; 
		int[] ageList = new int[100];
		
		//현재 고객수가 몇명이 저장되어있는지 알기 위한 변수.
		int count = 0;
		
		ex:while(true) {
			
			//메뉴
			System.out.println("[Info]-고객수:" + count);
			System.out.println("[메뉴]1.추가, 2.전체보기, 3.정보검색, 4.정보수정, 5.정보삭제, 6.나가기");
			System.out.print("메뉴입력>");
			String menu = scan.next();
			
			switch(menu) {
			
			case "1":
				System.out.println("=========고객 정보 입력==========");
				/*
				 * 1. 이름과, 나이를 입력받고, 배열에 순서대로 값을 저장합니다.
				 * 2. count값을 증가
				 * 
				 */
				System.out.print("이름>");
				String name = scan.next();
				System.out.print("나이>");
				int age = scan.nextInt();
				
				nameList[count] = name;
				ageList[count] = age;
				count++;
				
				System.out.println("=============================");
				break;
			case "2":
				System.out.println("========전체 고객정보 출력=========");
				/*
				 * 1. 배열에 저장된 고객정보 "name~님의 나이는 age입니다." 전부출력 
				 */
				for(int i = 0; i < count; i++) {
					System.out.println(nameList[i] + "님의 나이는 " + ageList[i]);
				}
				
				System.out.println("=============================");
				break;
			case "3":
				System.out.println("==========고객 정보 검색==========");
				/*
				 * 1. 이름을 입력받아서.
				 * 2. 배열에서 이름을 찾은 후에, "name님은 x번째에 있습니다"
				 * 						 "name님의 나이는 age입니다"
				 * 
				 * 3. 혹시 찾는 이름이 없다면, "name님의 정보는 없는데요?"
				 */
				
				System.out.print("검색할 이름>");
				String a = scan.next();
				
				boolean bool = false;
				for(int i = 0; i < count; i++) {
					
					if(a.equals(nameList[i]) ) {
						System.out.println(a + "님은 " + (i+1) + "번째에 있습니다" );
						System.out.println(a + "님의 나이는 " + ageList[i] + "입니다");
						bool = true;
					}
				}
					
				if(bool == false) { //if문장 실행을 안함
					System.out.println(a + "님의 정보는 없습니다");
				}
				
				
				
				System.out.println("=============================");
				break;
			case "4":
				System.out.println("==========고객 정보 수정=========");
				/*
				 * 1. 먼저 모든 name을 출력해서 볼 수 있게 처리
				 * 2. 수정할 이름을 입력을 받습니다.
				 * 3. 해당이름을 배열에서 찾은 후에, name, age를 다시 입력받습니다.
				 * 4. 입력받은 name, age로 수정해줍니다.
				 * 5. 잘못 입력된 경우는 "name님은 없습니다" 로 출력.
				 */
				System.out.print("현재정보:");
				for(int i = 0; i < count; i++) {
					System.out.print(nameList[i] + " ");
				}
				System.out.println();
				
				System.out.print("수정할 이름>");
				String b = scan.next();
				
				boolean bool2 = false;
				for(int i = 0; i < count; i++) {
					
					if(b.equals(nameList[i])) { //수정할 이름 위치
						
						System.out.print("변경할 이름>");
						String c = scan.next();
						
						System.out.print("변경할 나이>");
						int d = scan.nextInt();
						
						nameList[i] = c;
						ageList[i] = d;
						bool2 = true; //변경됨
						
						System.out.println("회원정보가 수정 되었습니다!!");
						break;
						
					}
				}
				
				if(bool2 == false) {
					System.out.println(b + "님은 없습니다");
				}
				
				System.out.println("=============================");
				break;
			case "5":
				System.out.println("==========고객 정보 삭제==========");
				/*
				 * 1. 먼저 모든 name을 출력해서 볼 수 있게 처리
				 * 2. 삭제할 이름을 입력을 받습니다.
				 * 3. 이름이 어느위치에 있는지 찾고, 찾은 위치에서부터 count미만 값을 하나씩 당겨 오면됩니다.
				 * 4. count위치는 null, 0 초기화 하고 count--
				 */
				
				System.out.print("현재정보:");
				for(int i = 0; i < count; i++) {
					System.out.print(nameList[i] + " ");
				}
				System.out.println();
				
				
				System.out.print("삭제할 이름>");
				String del = scan.next();
				
				for(int i = 0; i < count; i++) {
					
					if(del.equals(nameList[i])) {
						
						//삭제(찾은 위치부터~~ < count-1 )
						for(int j = i; j < count-1; j++) {
							nameList[j] = nameList[j+1];
							ageList[j] = ageList[j+1];
						} //
						nameList[count-1] = null; //원래 있던 사람을 없는 값으로 변경
						ageList[count-1] = 0; 
						count--; //사람 수를 한명 감소
						
					}
					
				}
				
				
				System.out.println("=============================");
				break;
			case "6":
				System.out.println("=============================");
				System.out.println("===========프로그램 종료==========");
				System.out.println("=============================");
				
				//while탈출 하면 됩니다.
				break ex;
				
			default :
				System.out.println("===========================");
				System.out.println("========메뉴는 숫자로 입력=======");
				System.out.println("===========================");
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
	}
}
