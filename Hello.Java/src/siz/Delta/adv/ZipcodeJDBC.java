package siz.Delta.adv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZipcodeJDBC {

	public static void main(String[] args) {

		// 오라클 접속 정보 설정
		String DRV = "oracle.jdbc.driver.OracleDriver";
		String URL = "jdbc:oracle:thin:@192.168.52.128:1521:xe";
		String USR = "hr";
		String PW = "hr";

		// JDBC관련 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// SQL 관련 변수선언
		String selectOneSQL = " select*from zipcode_seoul where \"도로명\" like ? ";

		// TCF 및 필요구문 작성
		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("조회하려는 도로명 주소를 입력\n >>>");
			String wd = sc.next();
			// 1.
			Class.forName(DRV);
			// 2 .
			conn = DriverManager.getConnection(URL, USR, PW);
			// 3.
			pstmt = conn.prepareStatement(selectOneSQL);
			pstmt.setString(1, wd + "%");
			rs = pstmt.executeQuery();// 4

			// 5

			List<ZipcodeVO> cdlist = new ArrayList<>();
			while (rs.next()) {
				ZipcodeVO zcd = new ZipcodeVO();

				zcd.set우편번호(rs.getInt("우편번호"));
				zcd.set시도(rs.getString("시도"));
				zcd.set시군구(rs.getString("시군구"));
				zcd.set읍면(rs.getString("읍면"));
				zcd.set리명(rs.getString("리명"));
				zcd.set건물번호본번(rs.getInt("건물번호본번"));
				zcd.set건물번호부번(rs.getInt("건물번호부번"));
				zcd.set도로명(rs.getString("도로명"));
				zcd.set법정동명(rs.getString("법정동명"));
				zcd.set시군구용건물명(rs.getString("시군구용건물명"));
				zcd.set지번본번(rs.getInt("지번본번"));
				cdlist.add(zcd);// 전체 불러오기
			} // printout while문 end

			for (ZipcodeVO zcd : cdlist) {
				System.out.println(zcd);
			} // print out for문 end

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
			} catch (Exception e2) {
			}
			try {
				pstmt.close();
			} catch (Exception e2) {
			}
			try {
				conn.close();
			} catch (Exception e2) {
			}

		} // TCF end

	}// main end

}// class end
