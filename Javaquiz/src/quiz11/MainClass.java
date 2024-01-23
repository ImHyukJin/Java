package quiz11;

public class MainClass {

	public static void main(String[] args) {
		
		
		//Computer com = new Computer();
		
		KeyBoard key = new KeyBoard();
		Monitor monitor = new Monitor();
		Mouse mouse = new Mouse();
		
		Computer com = new Computer(key, mouse, monitor );
		com.computerInfo(); //컴퓨터 정보
		
		Monitor mo = com.getMonitor();
		mo.info();
		 
		
		System.out.println(monitor == mo); //true
		
		
		
		
		 
		 
		
	}
}
