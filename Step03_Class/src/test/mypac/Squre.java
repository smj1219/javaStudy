package test.mypac;

public class Squre {
	//가로 세로의 길이를 저장할 필드
	public int hei;
	public int wid;
	
	public void showArea() {
		//1. 넓이를 구해서
		int info=hei*wid;
		//int info = this.hei*this.wid;
		//2.콘솔창에 출력한다
		System.out.println("넓이 : "+info);
	}
}
