package exercises;

import java.util.Scanner;

import entities.ex3.FiguraGeometrica;

/* 
3. Classe FiguraGeometrica
Crie uma classe chamada FiguraGeometrica para realizar cálculos de área e
perímetro.
Atenção:
Neste exercício, a sobrecarga deve ser válida em Java. Portanto, as
assinaturas foram organizadas para não gerar conflito.
double calcularArea(double lado)
Neste método, deve implementar o cálculo da área de um quadrado
usando o valor do lado.
double calcularArea(double base, double altura)
Neste método, deve implementar o cálculo da área de um retângulo
usando base e altura.
double calcularArea(double raio, boolean circulo)
Neste método, deve implementar o cálculo da área de um círculo. O
parâmetro booleano existe apenas para tornar a assinatura diferente das
demais.
double calcularPerimetro(double lado)
Neste método, deve implementar o cálculo do perímetro de um quadrado.
double calcularPerimetro(double base, double altura)
Neste método deve implementar o cálculo do perímetro de um retângulo.
double calcularPerimetro(double raio, boolean circulo)
Neste método, deve implementar o cálculo do perímetro ou circunferência
de um círculo.
Requisitos:
Os métodos devem representar cálculos diferentes.
A implementação deve deixar claro qual figura está sendo tratada em cada
caso.
*/

public class Ex3 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 3 ---\n");

        FiguraGeometrica fig = new FiguraGeometrica();

        System.out.println("Quadrado (lado = 4):");
        System.out.println("Área: " + fig.calcularArea(4));
        System.out.println("Perímetro: " + fig.calcularPerimetro(4));

        System.out.println("\nRetângulo (base = 5, altura = 3):");
        System.out.println("Área: " + fig.calcularArea(5, 3));
        System.out.println("Perímetro: " + fig.calcularPerimetro(5, 3));

        System.out.println("\nCírculo (raio = 2.5):");
        System.out.println("Área: " + fig.calcularArea(2.5, true));
        System.out.println("Perímetro: " + fig.calcularPerimetro(2.5, true));

    }
}