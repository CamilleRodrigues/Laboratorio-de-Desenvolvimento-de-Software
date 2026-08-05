package ExercicioTres;

public class Casa {
    public float calcularPreco(int tamanho) {
        float valor;
        valor = tamanho * 3547.44f;
        return valor;
    }
    
    public float calcularPreco(int tamanho, int qtdQuartos) {
        float valor = (float) ((tamanho * 3327.51) + (qtdQuartos * 2321.49));
        return valor;
    }
}
