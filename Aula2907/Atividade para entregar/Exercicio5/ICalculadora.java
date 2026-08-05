//Quem implementar esta interface deverá possuir todos esses métodos, apenas informa quais métodos deverão existir
//nterface → quando você quer apenas dizer quais métodos uma classe deve ter, sem fornecer a implementação
public interface ICalculadora {
    double somar(double n1, double n2);
    double subtrair(double n1, double n2);
    double multiplicar(double n1, double n2);
    double dividir(double n1, double n2);
    double raizquadrada(double n1, double n2);
    double elevarPotencia(double n1, double n2);
    double logaritmo10(double n1);
}
