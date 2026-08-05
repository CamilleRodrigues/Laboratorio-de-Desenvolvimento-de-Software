public class Main {
    public static void main(String[] args) {
        //Criamos um objeto de cada classe, instanciação de um objeto
        //A variável que vou criar será do tipo CartaoCreditoPagamento (ou outro) + Nome da variável + Operador de atribuição + Crie um novo objeto + Chama o construtor da classe para inicializar o objeto
        CartaoCreditoPagamento cartao = new CartaoCreditoPagamento(); 
        PayPalPagamento paypal = new PayPalPagamento();
        PIXPagamento pix = new PIXPagamento();

        //Depois chamamos
        cartao.processaPagamento(150.00); //O valor irá vir aqui pois na classe abstrata MetodoPagamento temos o método processaPagamento que armazena valor
        cartao.mostraDetalhesPagamento();
        System.out.println();

        paypal.processaPagamento(250.00);
        paypal.mostraDetalhesPagamento();
        System.out.println();

        pix.processaPagamento(80.00);
        pix.mostraDetalhesPagamento();
    }
}
