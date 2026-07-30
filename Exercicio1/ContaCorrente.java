package br.camille.primeiroprojeto;

public class ContaCorrente {
    private float saldo;
    
    public void definirSaldoInicial(float valor) {
        saldo = valor;
    }

    public float getSaldo() {
        return saldo;
    }
    
    public void depositar(float valor) {
        saldo = saldo + valor; //saldo += valor
    }
    
    public boolean sacar (float valor) {
        if(saldo >= valor) {
            saldo = saldo - valor;//saldo -= valor
            return true;
        }
        else {
            return false;
        }
    }
}
