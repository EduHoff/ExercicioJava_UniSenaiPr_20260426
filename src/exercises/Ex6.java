package exercises;

import java.util.Scanner;

import entities.ex6.ContaBancaria;

/* 
6. Classe ContaBancaria
Crie uma classe chamada ContaBancaria com os atributos numeroConta,
titular, saldo, tipoConta e ultimaDescricao.
ContaBancaria(String numeroConta, String titular)
Neste construtor, deve criar a conta informando apenas número e titular. O
saldo e o tipo da conta devem receber valores padrão.
ContaBancaria(String numeroConta, String titular, String tipoConta)
Neste construtor, deve criar a conta informando também o tipo da conta. O
saldo deve receber valor padrão.
ContaBancaria(String numeroConta, String titular, String tipoConta, double
saldo)
Neste construtor, deve criar a conta já com todos os dados iniciais
principais.
void depositar(double valor)
Neste método, deve implementar a lógica de depósito simples,
adicionando o valor ao saldo.
void depositar(double valor, String descricao)
Neste método, deve implementar a lógica de depósito e também registrar
uma descrição da transação no atributo apropriado.
boolean sacar(double valor)
Neste método, deve implementar a lógica de saque normal, verificando se
há saldo suficiente e aplicando as regras do tipo da conta.
boolean sacar(double valor, double taxaExtra)
Neste método, deve implementar a lógica de saque considerando, além
das regras normais da conta, uma taxa extra informada por parâmetro.
Regras:
Se a conta for poupanca, cada saque deve considerar uma taxa de 0,5%.
Se a conta for corrente, não deve haver essa taxa padrão.
O método deve impedir operações inválidas.
*/

public class Ex6 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 6 ---\n");

         ContaBancaria c1 = new ContaBancaria("001", "Ana");
        ContaBancaria c2 = new ContaBancaria("002", "Carlos", "poupanca", 1000.0);

        System.out.println("=== Conta 1 (corrente) ===");
        c1.depositar(500);
        c1.depositar(200, "Depósito salário");
        System.out.println("Saldo: " + c1.getSaldo());
        System.out.println("Última descrição: " + c1.getUltimaDescricao());

        System.out.println("\nTentando sacar R$ 100:");
        System.out.println("Sucesso: " + c1.sacar(100));
        System.out.println("Saldo: " + c1.getSaldo());

        System.out.println("\nTentando sacar R$ 1000 (deve falhar):");
        System.out.println("Sucesso: " + c1.sacar(1000));
        System.out.println("Saldo: " + c1.getSaldo());


        System.out.println("\n=== Conta 2 (poupança) ===");
        System.out.println("Saldo inicial: " + c2.getSaldo());

        System.out.println("\nSacando R$ 100 (com taxa de 0.5%):");
        System.out.println("Sucesso: " + c2.sacar(100));
        System.out.println("Saldo: " + c2.getSaldo());

        System.out.println("\nSacando R$ 100 com taxa extra de R$ 10:");
        System.out.println("Sucesso: " + c2.sacar(100, 10));
        System.out.println("Saldo: " + c2.getSaldo());
    }
}