package dao;

import beans.Pessoa;
import java.sql.*;
import projetoaulabd.conexao.Conexao;

public class PessoaDao {
    Conexao conexao;
    Connection conn;
    
    public PessoaDao() {
        this.conexao = new Conexao();
        this.conn = conexao.getConexao();
    }
    
    public void inserir(Pessoa pessoa) {
        String sql = "INSERT INTO pessoa (nome, sexo, idioma) VALUES (?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            stmt.execute();
        } catch (SQLException e) {
            System.out.println("Erro ao inserir pessoa: " + e.getMessage());
        }
    }
}
