package Interface;

public class Interfaces_example1 {

interface I{
	public void z();
}
class A implements I{ //A에서 I를 무조건 구현 
	public void z() {}; // 인터페이스 I를 무조건 포함
}
}
