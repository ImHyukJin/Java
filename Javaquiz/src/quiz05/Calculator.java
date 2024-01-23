package quiz05;

public class Calculator {

	int result;
	double pi = 3.14;
	
	int add(int a) {
		result += a;
		return result;
	}
	
	double circle(int r) {
		return pi * r * r;
	}
	
	
}
