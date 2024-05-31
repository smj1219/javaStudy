package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass03 {
 public static void main(String[] args) {
	 //수정할 회원의 정보라고 가정하자
	int num=1;// primary key
	String name="에이콘";
	String addr="강남";
	
	//위의 정보내로 1번 회원의 이름을 에이콘, 주소를 강남으로 수정하는 프로그래밍을 해보세요
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
	PreparedStatement pstmt=null;
	try {
		//실행할 미완성의 sql 문
		String sql="UPDATE member"
				+" SET name=?, addr=?"
				+" WHERE num=?";
				
		//미완성의 sql 문을 전달하면서 대신 객체의 참조값 얻어내기
		pstmt=conn.prepareStatement(sql);
		//PreparedStatement 객체의 메소드를 이용하여 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
		pstmt.setString(1, name); 
		pstmt.setString(2, addr); 
		pstmt.setInt(3, num); 
		//sql 문 실행하기
		pstmt.executeUpdate();
		System.out.println("회원의 정보를 수정했습니다.");
	}catch(Exception e) {
		e.printStackTrace();
		}
}
}
