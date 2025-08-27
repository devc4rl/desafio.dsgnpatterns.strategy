import calc.fast.strategy.*;

public class Main {
    public static void main (String[] args) {
        PagamentoContext contexto = new PagamentoContext();

//        Usando o cartãp

        contexto.setStrategy(new PagamentoCartao());
        contexto.processarPagamento(250.0);

        // Usando o Pix

        contexto.setStrategy(new PagamentoPix());
        contexto.processarPagamento(100.0);

        // Usando o PayPal

        contexto.setStrategy(new PagamentoPaypal());
        contexto.processarPagamento(50.0);
    }
}