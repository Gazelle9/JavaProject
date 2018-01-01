package etc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Soccer_Insert {

	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.52.128:1521:xe";
	private static String USR = "osopola";
	private static String PW = "159753";

	public static void main(String[] args) throws Exception {

		oracle.jdbc.driver.OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(oracleDriver);
		Connection conn = DriverManager.getConnection(URL, USR, PW);
		java.sql.Statement stmt = conn.createStatement();
		String sql = "insert into member(name,tel,email,pwd) values('홍길동',1212-1313','hong100@test.com',password('1111')";
		int count = stmt.executeUpdate(sql);
		System.out.println(count);

		sql = "update member set name ='호호호' where email ='hong101@test.com'";
		stmt.close();
		conn.close();

	}
}