package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnector;
;

public class MainClass07 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정, 번호는 시퀀스로 넣기
		String name="돼지";
		String addr="상도동";
		
		//추가할 회원의 정보를 MemberDto 객체에 담는다
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//insert () 메소드 호출하면서 MemberDto 객체의 참조값을 전달한다.
		MainClass07.insert(dto);
	}
	//회원 정보를 DB 에 저장해주는 static 메소드
	public static void insert(MemberDto dto) {
		//dto에 추가할 회원의 이름과 주소가 들어있다는 가정하에서 메소드를 완성해보세요
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			conn=new DBConnector().getConn();
			String sql="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";		
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.executeUpdate();
			System.out.println("회원의 정보를 추가했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
	}
}
