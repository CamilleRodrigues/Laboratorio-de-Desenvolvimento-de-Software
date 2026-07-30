package ExercicioTres;

public class Principal {
    public static void main(String[] args) {
        Casa c = new Casa();
        float valor = c.calcularPreco(52);
        System.out.println("Valor da casa 1: " + valor);
        valor = c.calcularPreco(52, 3);
        System.out.println("Valor da casa 2: " + valor);
    }
}
