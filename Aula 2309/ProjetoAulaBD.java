package projetoaulabd;
import projetoaulabd.conexao.conexao;

public class ProjetoAulaBD {

    public static void main(String[] args) {
        conexao c = new conexao();
        c.getConexao();
    }
    
}
