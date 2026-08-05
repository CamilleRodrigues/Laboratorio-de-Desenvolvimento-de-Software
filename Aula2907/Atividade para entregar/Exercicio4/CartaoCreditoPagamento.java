public class CartaoCreditoPagamento extends MetodoPagamento { //Herança, CartaoCreditoPagamento herda tudo que existe em MetodoPagamento
    public CartaoCreditoPagamento() {
        super("Cartão de Crédito"); //Construtor da classe MetodoPagamento, coloque o nome como Cartão de Crédito
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
