package test.main;

import test.mypac.Squre;

public class MainClass07 {
	public static void main(String[] args) {
		//Squre 클래스로 객체를 생성하고 참조값을 squ 라는 지역변수에 담기
		Squre squ =new Squre();
		//가로 세로 값을 임의로 부여하고
		squ.hei = 10;
		squ.wid = 14;
		//메소드 호출해서 테스트해보기
		squ.showArea();
	}
}
