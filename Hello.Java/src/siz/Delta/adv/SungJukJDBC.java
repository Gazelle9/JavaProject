package siz.Delta.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import project.v1.SungJukV0;

public class SungJukJDBC {

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
		String selectSQL = "select sjno,name,kor,eng,mat,regdate from sungjuk order by sjno desc"; // <-
		String selectOneSQL = "select*from sungjuk where sjno = ? ";
		String insertSQL = null;
		String updateSQL = null;
		String deleteSQL = null;

		try {
			////////////////////////////////// 필요 명령문
			////////////////////////////////// 삽입///////////////////////////////////////

			// 1.
			Class.forName(DRV);
			// 2 .
			conn = DriverManager.getConnection(URL, USR, PW);
			// 3.
			pstmt = conn.prepareStatement(selectSQL); // selsctSQL 자리에 따로.
			// 4.
			rs = pstmt.executeQuery();
			// 5.
			StringBuffer out = new StringBuffer(); // stringbuffer 선언
			// 전부다 출력
			// while (rs.next()) {
			// out.append(rs.getString("sjno")).append("\t").append(rs.getString("name")).append("\t")
			// .append(rs.getString("kor")).append("\t").append(rs.getString("eng")).append("\t")
			// .append(rs.getString("mat")).append("\t").append(rs.getString("regdate")).append("\n");
			// }
			// System.out.println(out.toString()); // stringbuffer 출력

			List<SungJukV0> sjlist = new ArrayList<>();
			while (rs.next()) {
				SungJukV0 sj = new SungJukV0();
				sj.getNo(rs.getString("sjno"));
				sj.setName(rs.getString("name"));
				sj.setKor(rs.getInt("kor"));
				sj.setEng(rs.getInt("eng"));
				sj.setMat(rs.getInt("mat"));
				sj.setTot(rs.getInt("tot"));
				sj.setAvrg(rs.getDouble("avrg"));
				sj.setGrd(rs.getString("grd"));

				sjlist.add(sj);
			}
			for (SungJukV0 sj : sjlist) {
				System.out.println(sj);
			}

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
