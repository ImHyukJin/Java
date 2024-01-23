package quiz12;

public class MainClass {

	public static void main(String[] args) {
		//내케릭터
		Warrior me = new Warrior("나");
		//상대방케릭터
		Warrior you = new Warrior("너");
		Wizard you2 = new Wizard("너2");
		
		me.bash(you);
		me.bash(you2);
		
		System.out.println("--------------------");
		
		Player[] arr = {me, you};
		you2.blizzard(arr);
		you2.blizzard(arr);
		you2.blizzard(arr);
		
		me.info();
		you.info();
		you2.info();
		
		
		
		
		
	}
}
