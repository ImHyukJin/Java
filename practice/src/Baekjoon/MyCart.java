package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class MyCart extends Cart {

	MyCart(int money){
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}
	MyCart(){}
	
	 void buy(String product) {
	if(money <300) {
		System.out.println("금액부족");
		return;
	}
	//if(!(product.equals("tv") ~~~
	switch (product) {
	case "tv":
		money = money-tv ;
		add("tv");
		break;
	case "com":
		money -=com;
		add("com");
		break;
	case "radio":
		money -=radio;
		add("radio");
		break;
	default:
		System.out.println(product+"이라는 상품없음");
		return;
	}
	}
	 void add(String product){
		 if(index>=cart.length) {
			String[] b= Arrays.copyOf(cart,(cart.length*2));
			cart = b;
		 }
		 
		 cart[index] = product ;
		 index++;
		 
	}
	 void info() {
		 String a = "";
		 for(int i = 0 ; i<index ; i++) {
			 a += cart[i]+" ";
		 }
		 System.out.println("상품: "+a );
		 System.out.println("남은금액: " + money);
		 System.out.println(cart.length);
	 }
}
