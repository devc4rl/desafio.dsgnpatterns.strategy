package calc.fast.strategy;

public class PagamentoContext {
    private PagamentoStrategy strategy; //Aqui vai receber a estratégia que vai ser usada para pagar.

    public void setStrategy(PagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public void processarPagamento(double valor) {
        if (strategy == null) {
            System.out.println("Nenhuma forma de pagamento definida.");
        } else {
            strategy.pagar(valor);
        }
    }
}

