package day09.inter.basic2;

public class PetShop {

	//각각의 펫들을 저장할 수 있는 클래스
	
	//1. static carePet()
	//매개변수는 펫타입을 받아서 원본 타입으로 캐스팅 하는기능
	public static void carePet(IPet pet) {
		
		if(pet instanceof GoldFish) {
			GoldFish g = (GoldFish)pet;
			
			g.play();
		} else if(pet instanceof Dog) {
			Dog d = (Dog)pet;
			
			d.eat();
			
		} else if(pet instanceof Cat) {
			Cat c = (Cat)pet;
			
			c.eat();
		}
	}
	//2. static petInfo()
	//매개변수로 펫배열 타입을 받아서 play() 출력.
	public static void petInfo(IPet[] pets) {
		for(IPet p : pets) {
			p.play();
		}
	}
	
	
}
