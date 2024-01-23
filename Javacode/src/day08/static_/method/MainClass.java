package day08.static_.method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		//main은 static입니다
		//a변수를 사용하고 싶으면 객체생성을 해서 사용함.
		Count c = new Count();
		c.method();
		
		
		//static멤버를 호출할 때
		Count.b++;
		Count.method2();
		
		//현재 b는 몇일까요? 3
		Math.random();
		String.join("-", "010", "1234", "5678");
		Integer.parseInt("3");
		
		
		
	}
	
}
