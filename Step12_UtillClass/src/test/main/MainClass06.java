package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Member;
import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//1. MemeberDto 객체를 담을 수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 지역변수에 담아보세요
		List<MemberDto> members = new ArrayList<>();
		// 2. 3명의 회원정보를 MemberDto 객체에 각각 담아보세요. (Member 객체가 3개 생성도어야함)
		MemberDto m1= new MemberDto();
		//m1.num=1; //필드에 직접 접근 불가
		m1.setNum(1);
		m1.setName("김구라");
		m1.setAddr("노량진");
		//아래 방법은 갯수가 많아지면 순서를 헷갈릴 가능성이 있어서 set 메소드 사용하는 편이 좋다
		MemberDto m2= new MemberDto(2, "해골", "행신동");
		MemberDto m3= new MemberDto(3, "원숭이", "동물원"); 
		// 3. 위에서 생성된 MemberDto 객체의 참조값을 ArrayList 객체에 모두 담아보세요.
		members.add(m1);
		members.add(m2);
		members.add(m3);
		
		// 4.반복문을 이용해서 members 에 들어있는 회원 정보를 출력해 보세요.
		for(MemberDto mem:members) {
			/*
			 * String 클래스의 format() 이라는 static 메소드를 이용하면
			 * 원하는 문자열 형식을 좀 더 간편하게 얻어낼 수 있다.
			 * 
			 * %d => 숫자(정수)를 출력할 때
			 * %f => 실수 출력
			 * %s => 문자를 출력할 떄
			 * %b => boolean
			 * %% => % 자체를 출력할 때
			 * 
			 */
			String info =String.format("번호:%d 이름:%s 주소:%s",
					mem.getNum(),mem.getName(), mem.getAddr());
			System.out.println(info);
		}
		
		for(MemberDto mem:members) {
			System.out.println("번호:"+mem.getNum()+", 이름:"+mem.getName()+", 주소:"+mem.getAddr());
		};
		test();
		test("hi");
		test("hi","hello");
		test("hi","hello","bye");
		test();
	}
	//테스트용 메소드
	public static void test(String... msg) {
		// msg 는 String[] type 이다.
		for(String tmp:msg) {
			System.out.println(tmp);
		}
		
		
	}
}
