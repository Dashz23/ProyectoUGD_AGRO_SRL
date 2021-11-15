package Hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConecJDBC {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion;
		try {
			conexion = getConexion();
			System.out.println("Intentando Conectar a BSD:");
			System.out.println("conexion exitosa");
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
	}

	 public static Connection getConexion() throws SQLException {
	        String host = "127.0.0.1";
	        String user = "postgres";
	        String password = "sabrinabrasil";
	        int port = 5432; 
	        String database = "AGRO_SRL";

	        try {
	            Class.forName("org.postgresql.Driver");
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	        String url = String.format("jdbc:postgresql://%s:%s/%s",host,port,database);
	        System.out.println(url);
	        return DriverManager.getConnection(url, user, password);
	    }
}
