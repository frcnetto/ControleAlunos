package br.estacio.dsw.persistence.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection getConnection() {
		try {
			try {
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaweb", "postgres", "admin");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
