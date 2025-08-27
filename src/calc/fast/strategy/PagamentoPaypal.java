package calc.fast.strategy;

public class PagamentoPaypal implements PagamentoStrategy{

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com PayPal.");
    }
}
