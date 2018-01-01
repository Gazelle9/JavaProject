package siz.Delta.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import project.v1.SungJukV0;

public class SungJukJDBC2 {

	public static void main(String[] args) {
		// 성적 처리 JDBC 기본 뼈대.

		// 오라클 접속 정보 설정
		String DRV = "oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.52.128:1521:xe";
		String USR = "osopola";
		String PW = "159753";

		// JDBC관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// SQL 관련 변수선언
		String selectSQL = "select sjno,name,kor,eng,mat,regdate from sungjuk order by sjno desc";
		String selectOneSQL = "select*from sungjuk where sjno = ? "; // <- oracle에서 성적 번호 '?' 에 해당하는 데이터를 조회
		String insertSQL = null;
		String updateSQL = null;
		String deleteSQL = null;

		try {// 부분 조회
				//////////////////////////////////// 필요 명령문
				//////////////////////////////////// 삽입란/////////////////////////////////////

			// 입력
			Scanner sc = new Scanner(System.in);
			System.out.println("조회할 학생번호를 입력하세요");
			int no = sc.nextInt();

			// 1.
			Class.forName(DRV);
			// 2 .
			conn = DriverManager.getConnection(URL, USR, PW);
			// 3.
			pstmt = conn.prepareStatement(selectOneSQL); // 조회를위한 selsctOneSQL를 삽입.

			pstmt.setInt(1, no);// 첫번째 ? 자리에 실제로 적용될 값 지정
			// 4.
			rs = pstmt.executeQuery();
			// 5
			SungJukV0 sj = new SungJukV0();
			while (rs.next()) { // 하나만 지정해서 출력.!@!
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sj.setTot(rs.getInt("tot"));

			}
			System.out.println(sj);
			///////////////////////////////////////////////////////////////////////////////////////

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e) {
			}
			try {
				pstmt.close();
			} catch (Exception e) {
			}
			try {
				conn.close();
			} catch (Exception e) {
			}
		}
	}// MAIN END
}// CLASS END
