package coutinho.guilherme.bytebank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection recuperarConexao() {
        try {
            return DriverManager
                    .getConnection("jdbc:sqlserver://192.100.100.132;encrypt=false;databaseName=treinamento_java;user=java;password=Java@123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
