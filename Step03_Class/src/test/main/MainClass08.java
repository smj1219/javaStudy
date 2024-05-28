package test.main;

import test.mypac.Squre;

public class MainClass08 {
	public static void main(String[] args) {
		//2개의 Squre 객체를 생성해서
		Squre s1=new Squre();
		Squre s2=new Squre();
		// 각각의 필드에 다른 값을 담을 수도 있다.
		s1.hei=10;
		s1.wid=10;
		
		s2.hei=20;
		s2.wid=20;
		//메소드를 호출해보면 각각 넓이가 다르다는 것을 알 수 있다
		s1.showArea();
		s2.showArea();
	}
}
