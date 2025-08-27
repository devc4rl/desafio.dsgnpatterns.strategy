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

▶️ Como executar
# Compilar
javac src/**/*.java -d out

# Executar
java -cp out context.Main

✅ Exemplo de Saída
Processando pagamento de R$ 100,00 com Cartão...
Processando pagamento de R$ 250,00 com PayPal...
Processando pagamento de R$ 75,00 com Pix...

🔮 Possíveis melhorias

Adicionar validação de dados (ex: número de cartão).

Implementar log de transações.

Criar uma interface gráfica simples.

Usar Factory Method para instanciar as estratégias de pagamento.
