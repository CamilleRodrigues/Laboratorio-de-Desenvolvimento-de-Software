package Heranca;

public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Camille";
        p.cpf = "0123456789";
        
        Professor prof = new Professor();
        prof.nome = "Ricardo F";
        prof.cpf = "1234567892";
        prof.curso = "Sistemas de Informação";
        prof.matricula = 120402;
        System.out.println("Professor: " + prof);
    }
}
