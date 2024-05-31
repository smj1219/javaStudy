package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass04 {
	public static void main(String[] args) {
		//삭제할 회원의 PK라고 가정
		int num=1;
		
		//실제 삭제하는 프로그래밍을 해 보세요.
		Connection conn=null;
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피 주소 : port 번호: db 이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott","tiger");
			//
			System.out.println("Oracle DB 연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		PreparedStatement pstmt=null;
		try {
			String sql="DELETE FROM member"
					+" WHERE num=?";		
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			//sql 문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원의 정보를 삭제했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
			}
	}
}
