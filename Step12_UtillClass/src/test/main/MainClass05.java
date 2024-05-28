package test.main;

import test.mypac.Member;
import java.util.ArrayList;
import java.util.List;

public class MainClass05 {
	public static void main(String[] args) {
		// 1. Member 객체를 담을 수 있는 ArrayList 객페를 생성해서 참조값을 members 라는 지역변수에 담아보세요

		List<Member> members = new ArrayList<>();
		// 2. 3명의 회원정보를 Member 객체에 각각 담아보세요. (Member 객체가 3개 생성도어야함)
		int num = 1;
		String name ="김구라";
		String addr ="노량진";
		Member m1 =new Member(num,name,addr);
		Member m2 =new Member();
		m1.num=2;
		m1.name="해골";
		m1.addr="행신동";
		Member m3 =new Member(3,"원숭이","동물원");
		// 3. 위에서 생성된 Member 객체의 참조값을 ArrayList 객체에 모두 담아보세요.
		members.add(m1);
		members.add(m2);
		members.add(m3);
		/*
		 * 4. member List 객체에 담긴 내용을 이용해서 회원 목록을 아래와 같은 형식으로 반복문을 돌면서 출력해보세요
		 * 
		 * 번호: 1, 이름: 김구라, 주소: 노량진
		 * 번호: 2, 이름: 해골, 주소: 행신동
		 * .
		 * .
		 */
		for(Member mem:members) {
			System.out.println("번호:"+mem.num+", 이름:"+mem.name+", 주소:"+mem.addr);
		}
		
		members.forEach((mem)->{
			String info = "번호:"+mem.num+", 이름:"+mem.name+", 주소:"+mem.addr;
			System.out.println(info);
		});
		
	}
}
