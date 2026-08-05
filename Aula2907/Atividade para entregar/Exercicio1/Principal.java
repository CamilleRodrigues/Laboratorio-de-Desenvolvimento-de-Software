package br.camille.primeiroprojeto;

public class PrimeiroProjeto {

    public static void main(String[] args) {
        ContaCorrente novaConta = new ContaCorrente();
        
        System.out.println("Conta instanciada!");
	novaConta.definirSaldoInicial(1000);
        System.out.println("Saldo 1: " + novaConta.getSaldo());
	if(novaConta.sacar(500)) {
            System.out.println("Saque efetuado!");
        }
        else {
            System.out.println("Saque não efetuado!");
        }
	novaConta.depositar(50);
        System.out.println("Saldo 2: " + novaConta.getSaldo());
	if(novaConta.sacar(600)) {
            System.out.println("Saque efetuado!");
        }
        else {
            System.out.println("Saldo insuficiente para o saque!");
        }
    }
}
