package br.com.caelum.agenda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class ConnectorFactory {
    public Connection getConnection() {
   System.out.println("Conectando ao banco");
    try {
    	  DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
            return DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "senha");
            } catch(SQLException e) {
               e.printStackTrace();
                throw new RuntimeException(e);

        }
    }
}


