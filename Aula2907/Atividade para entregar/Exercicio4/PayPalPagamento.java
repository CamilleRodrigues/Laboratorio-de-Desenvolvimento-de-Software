public class PayPalPagamento extends MetodoPagamento { //Herança, PayPalPagamento herda tudo que existe em MetodoPagamento
    public PayPalPagamento() {
        super("PayPal"); //Construtor da classe MetodoPagamento, coloque o nome como PayPal
    }

    @Override //Substitui um método que veio da classe mãe, cada classe filha é obrigada a criar sua própria versão
    public void processaPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado!");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("Método de Pagamento: " + getNomeMetodo()); //Os getters permitem acessar o valor de forma controlada
        System.out.println("Identificador do Pagamento (ID): " + getIdPagamento());
    }
}
