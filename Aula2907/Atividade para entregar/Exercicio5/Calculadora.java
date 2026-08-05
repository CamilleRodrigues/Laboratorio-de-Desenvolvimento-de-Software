//A classe Calculadora vai seguir as regras da interface ICalculadora, todos os métodos precisam existir
public class Calculadora implements ICalculadora { 
    @Override //Estou implementando (ou sobrescrevendo) o método que veio da interface
    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    @Override
    public double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    @Override
    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    @Override
    public double dividir(double n1, double n2) {
        return n1 / n2;
    }

    @Override
    public double raizquadrada(double n1, double n2) { //A raiz quadrada só precisa de um número,o segundo parâmetro (n2) fica sem uso. Isso acontece porque a interface foi definida dessa forma. Na Main, passamos um valor qualquer (como 0) apenas para atender à assinatura do método
        return Math.sqrt(n1); //Math é uma classe pronta do Java
    }

    @Override
    public double elevarPotencia(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    @Override
    public double logaritmo10(double n1) {
        return Math.log10(n1);
    }

}
