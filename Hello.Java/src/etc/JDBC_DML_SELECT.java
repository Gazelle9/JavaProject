package etc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC_DML_SELECT {
	private static String DRV = "oracle.jdbc.driver.OracleDriver";
	private static String URL = "jdbc:oracle:thin:@192.168.52.128:1521:xe";
	private static String USR = "osopola";
	private static String PW = "159753";

	public static void main(String[] args) throws Exception {
		oracle.jdbc.driver.OracleDriver oracleDriver = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(oracleDriver);

		Connection conn = DriverManager.getConnection(URL, USR, PW);

		Statement stmt = conn.createStatement();
		String sql = "select mno,name,tel,email from member";
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {
			String out = rs.getInt("mno") + "," + rs.getString("name") + "," + rs.getString("tel") + ","
					+ rs.getString("email");
			System.out.println(out);
		}

		rs.close();
		stmt.close();
		conn.close();

	}

}
