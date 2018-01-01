package siz.Delta.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import project.v1.SungJukV0;

public class SungJukJDBC6 {

	public static void main(String[] args) {
		// 성적 처리 JDBC
		// ResourceBundle를 이용해서 jdb관련정보를 특정 파일에서 키=값 형태로 읽어서 처리
		String rbPath = "etc.oracle"; // 리소스 번들 파일 경로 지정 : 패키지 . 파일명 (.properties 확장명은 제외!)

		// 오라클 접속 정보 설정
		String DRV = null;
		String URL = null;
		String USR = null;
		String PW = null;

		// JDBC관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// SQL 관련 변수선언
		String selectSQL = " select sjno,name,kor,eng,mat,regdate from sungjuk order by sjno desc";
		String selectOneSQL = " select*from sungjuk where sjno = ? ";
		String insertSQL = " insert into sungjuk(sjno,name,kor,eng,mat,tot,avrg,grd) values(sjno.nextval,?,?,?,?,?,?,?) ";
		String updateSQL = " update sungjuk set name=?, kor=?, eng=?, mat=? were sjno=?";
		String deleteSQL = "delete from sungjuk where sjno=?";
		try {
			////////////////////////////////// 필요 명령문
			////////////////////////////////// 삽입///////////////////////////////////////
			// 0. 접속정보를 리소스 번들로부터 읽어오기
			ResourceBundle rb = ResourceBundle.getBundle(rbPath);

			DRV = rb.getString("DRV");
			URL = rb.getString("URL");
			USR = rb.getString("USR");
			PW = rb.getString("PW");

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

			List<SungJukV0> sjlist = new ArrayList<>();
			while (rs.next()) {
				SungJukV0 sj = new SungJukV0();

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
