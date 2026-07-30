package Abstrata;

public class Professor extends Pessoa {
    @Override
    void cadastrar() {
        System.out.println("Cadastrando professor");
        super.apresentarDados();
    }
}
