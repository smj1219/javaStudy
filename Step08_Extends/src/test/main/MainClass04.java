package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		//HandPhone 객체를 생성해서 나온 참조값을 Object type p3 라는 지역변수에 담기
		Object p3=new HandPhone();
		
		// 부모 type이 자식 type에 담길 수 없으나 casting 으로 명시를 해주면 담을 수 있다
		//casting 연산자를 이용해서 대입연산자의 우측 Phone type 으로 먼저 인식되도록 한다.
		Phone p2 = (Phone)p3;
		//casting 연산자를 이용해서 대입연산자의 우측 HandPhone type 으로 먼저 인식되도록 한다.
		HandPhone p1=(HandPhone)p3;
		
	}
}
