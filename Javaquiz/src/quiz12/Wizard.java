package quiz12;

public class Wizard extends Player{
 	//Player클래스로 상속관계를 만들어 주세요
	//마법사는 생성될 때 ★이름만 매개변수로 받고, hp = 50, mp = 100이 됩니다.
	//마법사는 강력한 iceArrow()를 가지고 있습니다
	//iceArrow()는 호출될떄마다 mp를 -20씩 감소시킵니다
	
	
	//1. 생성자가 정상적으로 연결될 수 있도록 부모클래스와 연결
	Wizard(String n) {
		name = n;
		hp = 50;
		mp = 100;
	}
	
	public void iceArrow() {
		System.out.println("아이스볼트 사용!");
		this.mp -= 20; //나의 mp
	}
	
	/*
	 * blizzard(Player[] arr) 메서드 광역스킬
	 * 
	 * 1. player[]에 있는 대상의 hp를 1~10씩 랜덤하게 깎아주면 됩니다.
	 * 
	 * 1.매개변수 players배열을 향상된 for문으로 회전.
	 * 2.for문 안에서는 1~10사이의 랜덤난수를 발생.
	 * 3.players배열의 hp를 각각 랜덤난수 만큼 감소시킵니다.
	 * 4.plyaers배열의 이름과 함께 랜덤 피해를 각각 출력하세요
	 */
	
	public void blizzard(Player[] arr) {
		
		for(Player p : arr ) {
			
			int ran = (int)(Math.random() * 10 + 1);
			p.hp -= ran;
			
			System.out.println(p.name +"님이 " + ran + "피해를 받았습니다");
		}
		
		
		
	}
	
	
	
	
	
	
	
}
