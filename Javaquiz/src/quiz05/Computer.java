package quiz05;

public class Computer extends Calculator {

	//오버라이딩
	double circle(int r) {
		
		return Math.PI * r * r;
	}
	
	//오버로딩
	double rect(double a) {
		return a * a; //정사각형
	}
	
	double rect(double a, double b) {
		return a * b; //직사각형
	}
	
	double rect(double a, double b, double c) {
		return a * b * c;
	}
	
	
	
	
	
}
