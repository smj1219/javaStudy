package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//번호를 입력 받아서
		System.out.println("검색할 회원의 번호 입력");
		int num = scan.nextInt();
		// 번호에 해당하는 회원 한명의 정보를 MemberDao 객체를 이용해서 얻어온 다음
		MemberDao mem1=new MemberDao();
		MemberDto mem2=mem1.getData(num);
		//회원 정보를 출력한다. (존재하지않는 회원 번호이면 정보가 없다고 출력)
		if(mem2!=null) {
			String info = String.format("번호:%d, 이름:%s, 주소:%s", mem2.getNum(),mem2.getName(),mem2.getAddr());
			System.out.println(info);
		} else {
			System.out.println(num+"번 회원 정보가 존재하지 않습니다.");
		}
	}
}
