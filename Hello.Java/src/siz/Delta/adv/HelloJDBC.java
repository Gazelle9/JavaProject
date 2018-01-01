package siz.Delta.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HelloJDBC {

	public static void main(String[] args) {
		// JDBC 접속 테스트 - 오라클 데이터 베이스 이용

		Connection conn = null;
		String URL = "jdbc:oracle:thin:@192.168.52.128:1521:xe"; // database connections 를 통해 생성된 url을 삽입.
		String USR = "osopola";
		String PWD = "159753";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 오라클 관련 클래스를 올림.
			conn = DriverManager.getConnection(URL, USR, PWD); // 주소, 아이디, 비번을 실행

			if (!conn.isClosed()) // 닫히지 않았다면 접속성공
				System.out.println("오라클 접속성공!");

			Statement stmt = conn.createStatement();

			String sql = "insert into Customer values (99,'박지성','810101-1111111','영국 런던','010-1001-1111')";
			stmt.executeUpdate(sql);// 실행
			// update = insert update, delete
			sql = "insert into book (bno,bname,publisher,bkprice) values (bno.nextval,'축구의 역사','굿스포츠',7000)";
			stmt.executeQuery(sql);
			// Query = select

			try {
				stmt.close();
			} catch (Exception ex) {
			}
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (Exception ex) {
			}
		} // Try-Catch-Finaly 끝

	}// MAIN끝

}
