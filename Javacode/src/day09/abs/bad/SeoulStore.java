package day09.abs.bad;

public class SeoulStore extends Store {

	//store는 어떤기능이 있는지 모른다면...
	public void melon() {
		System.out.println("서울에서 멜론가격은 500원 입니다");
	}
	
	public void orange() {
		System.out.println("서울에서 오렌지가격은 600원 입니다");
	}
	
	//apple 오버라이딩을 해야하는데, 빼먹었다면...?
	
}
