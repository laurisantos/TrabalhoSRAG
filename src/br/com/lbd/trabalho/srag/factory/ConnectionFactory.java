package br.com.lbd.trabalho.srag.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lsnascimento
 */
public class ConnectionFactory {

    private String url, usuario, senha;

    public Connection getConnection() {
        url = "jdbc:postgresql://localhost:5432/trabalho_srag";
        usuario = "postgres";
        senha = "1234";

        try {
            Connection connection = DriverManager.getConnection(url, usuario, senha);
            connection.setAutoCommit(true);
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
