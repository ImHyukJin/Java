package quiz12;

public class Warrior extends Player {
	//Player클래스로 상속관계를 만들어 주세요
	//전사는 생성될 때 ★이름만 매개변수로 받고, hp = 100, mp = 50이 됩니다.
	//전사는 강력한 bash()를 가지고 있습니다
	//bash()는 호출될떄마다 mp를 -10씩 감소시킵니다
	
	//1. 생성자가 정상적으로 연결될수 있도록 부모클래스와 연결
	public Warrior(String n) {
		this.name = n;
		this.hp = 100;
		this.mp = 50;
	}
	/*
	 * 1. bash는 매개변수로 전사 or 마법사가 대상이 됩니다.
	 * 2. bash스킬 사용하면 나의 mp가 -10씩 소모가 됩니다.
	 * 3. 나의 mp가 100이하면 스킬을 사용할 수 없습니다.
	 * 4. 대상이 전사라면 상대방의 hp를 -10감소시킴
	 *    대상이 마법사라면 상대방의 hp를 -20감소시킴
	 */
	public void bash(Player p ) {
		
		if(this.mp < 10) {
			System.out.println("스킬을 사용할 수 없습니다");
			return;
		}
		
		System.out.println("배쉬 사용!");
		System.out.println(this.name + "님이 스킬을 사용해서 " + p.name + "님이 적중했습니다");
		this.mp -= 10;
		
		if( p instanceof Warrior ) { //전사임
			p.hp -= 10;
		} else if(p instanceof Wizard ) { //마법사임
			p.hp -= 20;
		}
		
		
	}
	
	
	
}
