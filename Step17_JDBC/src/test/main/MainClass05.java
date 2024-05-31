package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass05 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가넝, 번호는 시퀀스로 넣기
		String name="원숭이";
		String addr="동물원";
		
		Connection conn=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(url, "scott","tiger");
			System.out.println("Oracle DB 연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt=null;
		try {
			String sql="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";		
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
			//sql 문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원의 정보를 추가했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
			}
	}
}
