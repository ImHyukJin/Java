package day09.inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal dog = new Dog(); 
		Animal cat = new Cat();
		Animal tiger = new Tiger();
		
		
		Fish gold = new GoldFish();
		Fish shark = new Shark();
		
		//dog, cat, goldfish는 IPet타입이 될 수 있습니다.
		//ex) 강아지는 Animal이지만, 하위클래스가 상호연관이 있다면, 형변환이 됩니다
		IPet p1 = (IPet)dog;
		IPet p2 = (IPet)cat;
		IPet p3 = (IPet)gold;
		
		IPet[] arr = {p1, p2, p3 };
		
		for(IPet p : arr ) {
			p.play();
		}
		
		System.out.println("--------------------------");
		
		Animal a = (Animal)p1;
		Animal a2 = (Animal)p2;
		//Animal a3 = (Animal)p3; //err		
		
		System.out.println("--------------------------");;
		
		PetShop.carePet(  new Dog()  );
		PetShop.carePet(  arr[1]  );
		PetShop.carePet(  (IPet)gold );
		
		PetShop.petInfo(arr);
		
		
		
		
		
		
		
		
	}
}
