package br.com.lbd.trabalho.srag.factory;

import br.com.lbd.trabalho.srag.service.Service;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author lsnascimento
 */
public class testar {

    public static void main(String[] args) throws SQLException, IOException {
        Connection con = new ConnectionFactory().getConnection();
        System.out.println("Conexão realizada!");
        con.close();

        Service service = new Service();
        service.lerCSV();
    }

}
