package projetoaulabd;
import beans.Pessoa;
import dao.PessoaDao;
import projetoaulabd.conexao.Conexao;

public class ProjetoAulaBD {

    public static void main(String[] args) {
        Conexao c = new Conexao();
        c.getConexao();
        Pessoa p = new Pessoa();
        p.setNome("Camille Rodrigues");
        p.setSexo("F");
        p.setIdioma("Português");
        PessoaDao pdao = new PessoaDao();
        pdao.inserir(p);
    }
}
