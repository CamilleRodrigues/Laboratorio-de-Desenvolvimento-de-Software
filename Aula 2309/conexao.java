package projetoaulabd.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class conexao {
    public Connection getConexao(){
        Connection conn;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdaula01?usetTimeZone=true&serverTimeZOne=UTC", "root", "laboratorio");
            System.out.println("Conexão efetuada!");
            return conn;
        } catch (Exception e) {
            System.out.println("Erro ao conectar no BD" + e.getMessage());
            Logger.getLogger(conexao.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
}
