package in.maruthanalagar.mambilling.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {

	public static Connection getConnection() {
		Connection connection = null;
		String url = null;
		String userName = null;
		String password = null;

		try {
		//	Class.forName("com.mysql.cj.jdbc.Driver");
		//	connection = DriverManager.getConnection(url, userName, password);
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
			  "jdbc:mysql://aws.connect.psdb.cloud/m_a_m_billing?sslMode=VERIFY_IDENTITY",
			  "mit050gspr6xy5qfqiko",
			  "pscale_pw_9IAdDXLkNSvsaB6QnX6elJy3aOf6ZkwoMuA4fgdvtG8");


		} catch (Exception e) {

			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return connection;

	}

	public static void close(Connection newConnection, PreparedStatement ps) {
		try {
			if (ps != null) {
				ps.close();
			}
			if (newConnection != null) {
				newConnection.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void close(Connection newConnection, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (ps != null) {
				ps.close();
			}
			if (newConnection != null) {
				newConnection.close();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
