public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); //Essa linha cria um objeto da classe Calculadora

        System.out.println("Soma: " + calc.somar(10, 5)); //Usamos o objeto para chamar os métodos -> calc.somar(10, 5). Procura o método somar() dentro da classe Calculadora e executa
        System.out.println("Subtração: " + calc.subtrair(10, 5));
        System.out.println("Multiplicação: " + calc.multiplicar(10, 5));
        System.out.println("Divisão: " + calc.dividir(10, 5));
        System.out.println("Raiz Quadrada: " + calc.raizquadrada(25, 0));
        System.out.println("Potência: " + calc.elevarPotencia(2, 3));
        System.out.println("Logaritmo: " + calc.logaritmo10(100));
    }
}
