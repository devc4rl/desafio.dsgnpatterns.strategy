💳 Sistema de Pagamento com Padrão Strategy
Este projeto foi desenvolvido com o objetivo de demonstrar a aplicação prática do Padrão de Projeto Strategy em um cenário real: o processamento de diferentes métodos de pagamento em um sistema.

📖 O Padrão de Projeto Strategy
O Padrão Strategy permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Ele permite que o algoritmo (o "método de pagamento") varie independentemente do cliente que o utiliza.

Por que usamos este padrão aqui?

Flexibilidade: É fácil adicionar novos métodos de pagamento (como Bitcoin, Voucher, etc.) sem modificar o código existente.

Manutenibilidade: Cada lógica de pagamento é isolada em sua própria classe, facilitando a manutenção e a correção de bugs.

Código Limpo: O cliente (a classe PagamentoContext) não precisa saber como cada pagamento é processado, apenas que ele pode ser "executado".

📁 Estrutura do Projeto
O projeto é organizado em um pacote principal, com cada classe desempenhando um papel fundamental no padrão:

src
└── calc.fast.strategy
    ├── PagamentoStrategy.java      # A Interface (o contrato)
    ├── PagamentoCartao.java        # A Estratégia concreta 1
    ├── PagamentoPaypal.java        # A Estratégia concreta 2
    ├── PagamentoPix.java           # A Estratégia concreta 3
    └── PagamentoContext.java       # O Contexto (a classe que usa a estratégia)

✨ Como Funciona
A lógica é simples e elegante:

PagamentoStrategy: É a interface que define o método processarPagamento(). É o "contrato" que todas as estratégias devem seguir.

PagamentoCartao, PagamentoPaypal, PagamentoPix: São as estratégias concretas que implementam a interface PagamentoStrategy, cada uma com sua própria lógica de processamento de pagamento.

PagamentoContext: É a classe que mantém uma referência para a PagamentoStrategy e a utiliza. O cliente da classe PagamentoContext pode simplesmente definir a estratégia desejada e executar o pagamento, sem se preocupar com os detalhes internos.

💻 Como Rodar
Basta compilar e executar a sua classe principal (Main.java ou equivalente) para ver a demonstração. Você pode alternar entre as estratégias de pagamento para testar cada uma.

Exemplo de uso:

// Criando o contexto de pagamento
PagamentoContext contexto = new PagamentoContext();

// Definindo a estratégia para Pagamento com Cartão
contexto.setPagamentoStrategy(new PagamentoCartao());
contexto.executarPagamento(150.00);

System.out.println("--------------------");

// Mudando a estratégia para Pagamento via Pix em tempo de execução
contexto.setPagamentoStrategy(new PagamentoPix());
contexto.executarPagamento(50.00);

🛠 Tecnologias Utilizadas
Java

🤝 Contribuições
Sinta-se à vontade para sugerir melhorias, como a adição de novas estratégias de pagamento!
