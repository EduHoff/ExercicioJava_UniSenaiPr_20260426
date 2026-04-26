package exercises;

import java.util.Scanner;

import entities.ex1.CalculadoraEstatistica;

/* 
1. Classe CalculadoraEstatistica
Crie uma classe chamada CalculadoraEstatistica com métodos
sobrecarregados para calcular médias em diferentes situações.
double calcularMedia(int a, int b)
Neste método, deve implementar a lógica para calcular a média de dois
números inteiros informados por parâmetro.
double calcularMedia(int a, int b, int c)
Neste método, deve implementar a lógica para calcular a média de três
números inteiros.
double calcularMedia(int[] numeros)
Neste método, deve implementar a lógica para calcular a média de todos
os valores existentes dentro do vetor recebido por parâmetro.
CalculadoraEstatistica()
Este construtor deve criar o objeto sem receber nenhum valor inicial.
CalculadoraEstatistica(int[] numeros)
Este construtor deve receber um vetor de números e armazená-lo na
classe, caso o aluno escolha trabalhar com atributo interno para usar
depois em outros métodos.
Requisitos:
A média deve ser calculada corretamente em todos os casos.
O retorno deve permitir casas decimais.
Caso o aluno use atributo para armazenar o vetor, isso deve ser feito de
forma organizada.
*/

public class Ex1 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 1 ---\n");

        int[] lista_exemplo = {1, 2, 3, 4, 5};

        CalculadoraEstatistica calc1 = new CalculadoraEstatistica();
        CalculadoraEstatistica calc2 = new CalculadoraEstatistica(lista_exemplo);

        System.out.println("Média 2 números (3 e 4):");
        System.out.println(calc1.calcularMedia(3,4));

        System.out.println("\nMédia 3 números (3, 4 e 5):");
        System.out.println(calc1.calcularMedia(3,4, 5));

        System.out.println("\nMédia lista (1, 2, 3, 4 e 5):");
        System.out.println(calc1.calcularMedia(lista_exemplo));

        System.out.println("\nMédia lista interna (1, 2, 3, 4 e 5):");
        System.out.println(calc2.calcularMedia());
    }
}