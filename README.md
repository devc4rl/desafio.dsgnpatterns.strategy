🏦 Sistema de Pagamentos - Design Pattern Strategy

Este projeto implementa um sistema de pagamentos flexível em Java utilizando o Padrão de Projeto Strategy.
O objetivo é permitir que diferentes métodos de pagamento possam ser aplicados sem alterar a lógica central do sistema, promovendo abertura para extensão e fechamento para modificação (Princípio OCP - SOLID).

🚀 Funcionalidades

Pagamento via Cartão 

Pagamento via PayPal

Pagamento via Pix

Fácil extensão para novos métodos de pagamento

🛠️ Tecnologias

Java 17+

Padrão de Projeto Strategy

IDE: VS Code / IntelliJ IDEA

📂 Estrutura do Projeto
src/
 ├── strategy/
 │    ├── PagamentoStrategy.java       # Interface comum para os métodos de pagamento
 │    ├── CartaoPagamento.java     # Implementação: cartão de crédito
 │    ├── PayPalPagamento.java         # Implementação: PayPal
 │    ├── PixPagamento.java            # Implementação: Pix
 │
 └── context/
      ├── PagamentoContext.java        # Define qual estratégia será usada
      └── Main.java                  # Classe de execução

📖 Como funciona o Strategy aqui?

Criamos uma interface PagamentoStrategy que define o contrato para qualquer forma de pagamento.

Cada classe concreta (CartaoPagamento, PayPalPagamento, PixPagamento) implementa a lógica específica do método.

A classe PagamentoContext recebe dinamicamente a estratégia desejada e executa o pagamento.

Isso permite adicionar novos métodos de pagamento sem mudar o código existente.

🎯 Como Executar

Compile todas as classes:

javac src/calc/fast/strategy/*.java


Crie uma classe Main.java (caso não tenha) dentro de src/calc/fast/strategy/ para rodar os testes. Exemplo:

package calc.fast.strategy;

public class Main {
    public static void main(String[] args) {
        // Exemplo com Cartão
        PagamentoContext context = new PagamentoContext(new PagamentoCartao());
        context.pagar(100.0);

        // Exemplo com Pix
        context = new PagamentoContext(new PagamentoPix());
        context.pagar(50.0);

        // Exemplo com Paypal
        context = new PagamentoContext(new PagamentoPaypal());
        context.pagar(200.0);
    }
}


Compile o Main:

javac src/calc/fast/strategy/Main.java


Execute o programa:

java -cp src calc.fast.strategy.Main


Saída esperada:

Pagamento de R$100.0 realizado com CARTÃO.
Pagamento de R$50.0 realizado com PIX.
Pagamento de R$200.0 realizado com PAYPAL.
✅ Exemplo de Saída
Processando pagamento de R$ 100,00 com Cartão...
Processando pagamento de R$ 250,00 com PayPal...
Processando pagamento de R$ 75,00 com Pix...

🔮 Possíveis melhorias

Adicionar validação de dados (ex: número de cartão).

Implementar log de transações.

Criar uma interface gráfica simples.

Usar Factory Method para instanciar as estratégias de pagamento.
