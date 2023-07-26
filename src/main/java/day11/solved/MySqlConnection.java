package day11.solved;

import java.sql.*;

public class MySqlConnection {
	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://aws.connect.psdb.cloud:3306/core_java";
		String userName = "2ayve5sxjw7ryqi7i0s2";
		String password = "pscale_pw_1GDKwNfEiWO7r9XEUjh2ZZMNTzPuXKzCzgNFrB0hMJ1";

		Connection con = DriverManager.getConnection(url, userName, password);

		System.out.println("connection created...");
		con.close();
	}
}