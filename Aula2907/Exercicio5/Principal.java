package Abstrata;

public class Principal {
    public static void main(String[] args) {
        //Pessoa p = new Pessoa(); -> abastrato
        Professor p = new Professor();
        p.nome = "Pedro";
        p.idade = 29;
        p.cadastrar();
    }
}
