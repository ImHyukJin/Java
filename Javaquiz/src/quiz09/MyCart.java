package quiz09;

import java.util.Arrays;

public class MyCart extends Cart {

	//1. MyCart의 생성자에서는 int매개변수를 하나 받으며, 금액을 초기화합니다. 
	//tv=300원, com=400원, radio=500원 으로 초기화 
	public MyCart(int money) {
		this.money = money;
		this.tv = 300;
		this.com = 400;
		this.radio = 500;
	}

	//2. buy(), add(), info() 메서드를 오버라이딩 합니다.
	/*
	 * buy()의 기능
	 * 1. money가 300보다 작으면 "금액부족" 출력후 메서드를 종료.
	 *    매개변수가 tv, com, radio가 아니더라도 "상품없음" 출력 후 종료
	 * 2. 매개변수 "tv"라면 금액에서 tv가격을 빼고 add(상품)을 호출
	 *    매개변수 "com"라면 금액에서 com가격을 빼고 add(상품)를 호출
	 *    매개변수 "radio"라면 금액에서 radio를 빼고 add(상품)을 호출
	 */
	void buy(String product) {
		
		if(this.money < 300) {
			System.out.println("금액부족");
			return;
		}
		
//		if(  ! (product.equals("tv") || product.equals("com") || product.equals("radio") )  ) {
//			System.out.println("상품없음");
//			return;
//		}
		switch (product) {
		case "tv":
			this.money -= 300;
			break;
		case "com":
			this.money -= 400;
			break;
		case "radio":
			this.money -= 500;
			break;
		default:
			System.out.println("상품없음");
			return; //함수종료
		}
		
		add(product);
		
	}
	
	/*
	 * add()의 기능
	 * 1. 만약 index의 값이 장바구니의 크기보다 같거나 크다면
	 *    -기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 *    -기존의 장바구니 값을 새로운 배열에 복사.
	 *    -새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 2. product를 장구니에 담는다.
	 * 
	 */
   
	void add(String product) { //resize기능
		
		if(index >= cart.length) {
			//String[] newArr= Arrays.copyOf(cart, cart.length * 2);
			
			String[] newArr = new String[cart.length * 2];
			for(int i = 0; i < cart.length; i++) {
				newArr[i] = cart[i];
			}
			cart = newArr;
			newArr = null;
			
		}
		
		cart[index] = product;
		index++;
		
	}
   
	/*
	 * info()의 기능
	 * 
	 * 2. 장바구니에 담긴 물건 목록을 + 금액을 더해서 출력
	 * 3. 메인에서 buy()를 실행 시킨다.
	 */
	
	void info() {
		
		String str = "";
		for(int i = 0; i < index; i++) {
			str += cart[i] + " ";
		}
		
		System.out.println("상품:" + str);
		System.out.println("남은금액:" + money);
	}
	
	
	
	
}
