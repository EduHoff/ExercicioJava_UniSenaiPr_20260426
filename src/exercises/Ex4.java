package exercises;

import java.util.Scanner;

import entities.ex4.Funcionario;

/* 
4. Classe Funcionário
Crie uma classe chamada Funcionário com os atributos nome, salário e cargo.
Funcionario(String nome, String cargo)
Neste construtor, deve criar um funcionário informando apenas nome e
cargo. O salário deve receber um valor padrão.
Funcionario(String nome, String cargo, double salario)
Neste construtor, deve criar um funcionário já informando o salário inicial.
void aumentarSalario(double percentual)
Neste método, deve implementar o aumento salarial com base em um
percentual. Por exemplo, se receber 10, deve aumentar 10% sobre o salário
atual.
void aumentarSalario(double valorFixo, boolean aumentoFixo)
Neste método, deve implementar o aumento salarial usando um valor fixo
em dinheiro. O parâmetro booleano serve para diferenciar a assinatura do
outro método.
String exibirDetalhes()
Neste método, deve retornar ou montar uma String contendo nome, cargo e
salário do funcionário.
Requisitos:
A sobrecarga deve ser válida.
Um método deve tratar aumento percentual e o outro aumento fixo.
*/

public class Ex4 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 4 ---\n");

        Funcionario f1 = new Funcionario("Ana", "Desenvolvedora");

        Funcionario f2 = new Funcionario("Carlos", "Gerente", 5000.0);

        System.out.println("Funcionário 1 (inicial):");
        System.out.println(f1.exibirDetalhes());

        System.out.println("\nFuncionário 2 (inicial):");
        System.out.println(f2.exibirDetalhes());

        System.out.println("\nAplicando aumento de 10% no Funcionário 1:");
        f1.aumentarSalario(10);
        System.out.println(f1.exibirDetalhes());

        System.out.println("\nAplicando aumento fixo de R$ 500 no Funcionário 2:");
        f2.aumentarSalario(500, true);
        System.out.println(f2.exibirDetalhes());
    }
}