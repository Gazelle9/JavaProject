package siz.Delta.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SungJukJDBC3 {

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
		String selectOneSQL = "select*from sungjuk where sjno = ? ";
		String insertSQL = " insert into sungjuk(sjno,name,kor,eng,mat,tot,avrg,grd) values(sjno.nextval,?,?,?,?,?,?,?) ";// <-
		String updateSQL = null;
		String deleteSQL = null;

		try { // 정보추가
				////////////////////////////////// 필요 명령문
				////////////////////////////////// 삽입///////////////////////////////////////

			// 입력
			Scanner sc = new Scanner(System.in);
			System.out.print(" 추가할 학생성적을 입력하세요\n (이름 /국어/ 영어/ 수학)\n >> ");
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int mat = sc.nextInt();

			// 총점/평균/학점 계산
			int tot = kor + eng + mat;
			double avrg = tot / 3;
			String grd = "가";

			switch ((int) avrg / 10) {
			case 10:
			case 9:
				grd = "수";
				break;
			case 8:
				grd = "우";
				break;
			case 7:
				grd = "미";
				break;
			case 6:
				grd = "양";
				break;
			}

			// 1.
			Class.forName(DRV);
			// 2 .
			conn = DriverManager.getConnection(URL, USR, PW);
			// 3.
			pstmt = conn.prepareStatement(insertSQL); // 조회를위한 selsctOneSQL를 삽입.
			pstmt.setString(1, name);
			pstmt.setInt(2, kor);
			pstmt.setInt(3, eng);
			pstmt.setInt(4, mat);
			pstmt.setInt(5, tot);
			pstmt.setDouble(6, avrg);
			pstmt.setString(7, grd);

			// 4.
			int cnt = pstmt.executeUpdate();

			System.out.println(cnt + "건의 데이터 추가 완료.");
			///////////////////////////////////////////////////////////////////////////////////////

		} catch (

		Exception ex) {
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
