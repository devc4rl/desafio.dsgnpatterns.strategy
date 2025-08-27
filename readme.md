💳 Pagamento com Padrão Strategy
Este projeto demonstra a aplicação do Padrão de Projeto Strategy em um sistema de pagamento. Ele permite que o método de pagamento (Cartão, Pix, PayPal) seja facilmente trocado, sem alterar o código principal.

📁 Como Funciona
O projeto usa três classes para implementar o padrão:

PagamentoStrategy: A interface (o contrato).

PagamentoCartao, PagamentoPaypal, PagamentoPix: As classes que implementam o contrato, cada uma com sua lógica de pagamento.

PagamentoContext: A classe que utiliza a estratégia escolhida para processar o pagamento.

🚀 Como Usar
Para testar, você pode criar uma classe Main e alternar as estratégias.

// Exemplo de como usar a classe de Contexto
PagamentoContext contexto = new PagamentoContext();

// Usa a estratégia de Pagamento via Cartão
contexto.setPagamentoStrategy(new PagamentoCartao());
contexto.executarPagamento(100.00);

// Troca a estratégia para Pagamento via Pix
contexto.setPagamentoStrategy(new PagamentoPix());
contexto.executarPagamento(50.00);

Tecnologia: Java****
