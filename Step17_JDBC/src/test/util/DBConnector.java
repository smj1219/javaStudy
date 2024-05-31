package test.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnector {
	//필드
	private Connection conn;
	//생성자
	public DBConnector() {
		//Connection 객체를 얻어와서 필드에 저장하기
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			conn=DriverManager.getConnection(url, "scott","tiger");
			System.out.println("Oracle DB 연결 성공");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Connection 객체를 리턴해주는 메소드
	public Connection getConn() {
		return conn;
	}
}
