package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * CREATE TABLE member(num NUMBER PRIMARY KEY, name VARCHAR2(16), addr VARCHAR2(20));
		 */
		//member 테이블에 추가할 회원 정보라고 가정하다 
		int num=3;
		String name="원숭이";
		String addr="동물원";
		//DB 연결 객체를 담을 지역변수 만들기
		Connection conn=null;
		try {
			//오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//접속할 DB 의 정보 @아이피 주소 : port번호:db이름
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			//계정 비밀번호를 이용해서Connection 객체의 참조값 얻어오기
			conn=DriverManager.getConnection(url, "scott","tiger");
			//
			System.out.println("Oracle DB 연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
		//sql 문을 대신 실행해줄 객체의 참조값을 담을 지연변수 미리 만들기
		PreparedStatement pstmt=null;
		try {
			//실행할 미완성의 sql 문
			String sql="INSERT INTO member"
					+" (num, name, addr)"
					+" VALUES(?, ?, ?)";
			//미완성의 sql 문을 전달하면서 대신 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체의 메소드를 이용하여 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
			pstmt.setInt(1, num); //1번째 ?에 숫자 바인딩
			pstmt.setString(2, name); //2번쨰 ?에 문자열 바인딩
			pstmt.setString(3, addr); //3번쨰 ?에 문자열 바인딩
			//sql 문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원의 정보를 저장했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
			}
	}
}
