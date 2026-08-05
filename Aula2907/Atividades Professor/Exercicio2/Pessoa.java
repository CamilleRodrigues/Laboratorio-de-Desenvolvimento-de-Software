package Abstrata;

public abstract class Pessoa {
    public String nome;
    public int idade;
    
    abstract void cadastrar();
    
    public void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
