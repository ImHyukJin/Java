package quiz15;

public class MainClass {

	public static void main(String[] args) {
		
		Shape cir = new Circle("원", 5);
		
		System.out.println(cir.getArea() );
		System.out.println(cir.getName() );
		
		Shape rect = new Rect("사각형", 5);
		
		System.out.println(rect.getArea() );
		System.out.println(rect.getName() );
		
		
	}
}
