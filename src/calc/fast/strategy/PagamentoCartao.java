package calc.fast.strategy;

public class PagamentoCartao implements PagamentoStrategy {
//implements é como se você estivesse se comprometendo a seguir algumas regras.
// Uma interface é um contrato, um conjunto de regras (métodos) que uma classe
// precisa seguir.(anotação de estudo durante o projeto para fixação)
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão.");

    }

}
