package siz.Delta.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MemberJDBC2 {

	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.52.128:1521:xe";
	private static String USR = "osopola";
	private static String PW = "159753";

	public static void main(String[] args) {
		// JDBC 를 이용한 CRUD 예제

		Connection conn = null; // DB연결
		PreparedStatement pstmt = null; // BD SQL문
		ResultSet rs = null; // select문 결과 처리

		// 데이터 입력 받기
		Scanner sc = new Scanner(System.in);
		System.out.println("이름/주민번호/주소/전화번호순으로 입력하시오");
		String name = sc.nextLine();
		String jumin = sc.nextLine();
		String addr = sc.nextLine();
		String hp = sc.nextLine();

		try { // 1. 데이터베이스 드라이버 메모리에 올림

			Class.forName(DRV);
			// 2. 지정된 ULR로
			conn = DriverManager.getConnection(URL, USR, PW);
			// 3 실행할 sql문을 생성
			String sql = "insert into customer values (cno.nextval,?,?,?,?)";// ? :Placeholder
			pstmt = conn.prepareStatement(sql);

			// PLACEHOLDER에 실제 값 지정
			pstmt.setString(1, name);
			pstmt.setString(2, jumin);
			pstmt.setString(3, addr);
			pstmt.setString(4, hp);

			// 작성된 sql문을 실행
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건의데이터 추가됨");

			// 3b 실행할 sql문을 생성 select
			sql = "select*from customer order by cno desc";
			pstmt = conn.prepareStatement(sql);

			// 4b sql문을 실행하고 결과 집합 저장
			rs = pstmt.executeQuery();

			// 4c 결과 집합 처리
			StringBuffer sb = new StringBuffer();
			while (rs.next()) {
				sb.append(rs.getString(1)).append("").append(rs.getString(2)).append("").append(rs.getString(3))
						.append("").append(rs.getString(4)).append("").append(rs.getString(5)).append("\n");
			}
			System.out.println(sb.toString());
		} catch (Exception ex) {
			ex.printStackTrace();

		} finally {
			try {
				conn.close();
			} catch (Exception ex) {
			}
			try {
				pstmt.close();
			} catch (Exception ex) {
			}
			try {
				pstmt.close();
			} catch (Exception ex) {
			}
		}
	}

}
