# Exercício Java básico : classes e encapsulamento

# Conta Bancária

Este projeto faz parte de uma série de exercícios práticos de **Java Básico** oferecidos pela [DIO (Digital Innovation One)](https://www.dio.me/), com foco em **classes, métodos e encapsulamento**.
Este projeto simula uma **conta bancária com cheque especial**, desenvolvido com o objetivo de aplicar conceitos de **Programação Orientada a Objetos (POO)** em Java.




## ✨ Funcionalidades

- Consultar saldo atual da conta
- Consultar limite de cheque especial disponível
- Depositar dinheiro na conta
- Sacar valores, usando o cheque especial se necessário
- Pagar boletos (com mesma lógica de saque)
- Verificar se a conta está usando o cheque especial
- Cobrança automática de taxa de 20% sobre o valor usado do cheque especial

## 🧠 Regras de negócio

- O **limite do cheque especial** é definido com base no valor do **depósito inicial**:
  - Se ≤ R$500 → limite fixo de R$50
  - Se > R$500 → limite igual a 50% do valor depositado
- O saldo da conta é usado primeiro; caso não seja suficiente, o cheque especial é acionado automaticamente.
- Ao realizar um depósito, se houver uso de cheque especial anterior, o sistema tenta quitar a dívida e aplicar a taxa correspondente antes de adicionar o restante ao saldo.

## 🔧 Tecnologias usadas

- Java 21+
- Scanner (para entrada de dados no console)
- Lógica condicional, encapsulamento e boas práticas de POO

## 🧪 Exemplos de uso

Ao executar a aplicação, o usuário pode:
1. Informar o valor de depósito inicial
2. Navegar pelo menu interativo no terminal e realizar operações
3. Visualizar mensagens explicativas para cada ação tomada (ex: uso de cheque especial, taxa aplicada, saldo restante)

## 📁 Organização

- `ContaBancaria.java`: classe principal com atributos e métodos da conta
- `Main.java`: classe com o menu principal e fluxo de execução interativo via terminal

