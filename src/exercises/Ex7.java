package exercises;

import java.util.Scanner;

import entities.ex7.ConversorTemperatura;

/* 
7. Classe ConversorTemperatura
Crie uma classe chamada ConversorTemperatura.
double converter(double celsius)
Neste método, deve implementar a conversão de Celsius para Fahrenheit.
double converter(double valor, char escalaOrigem)
Neste método, deve implementar a conversão do valor informado para uma
escala padrão definida na classe, considerando a escala de origem
recebida no parâmetro.
double converter(double valor, char escalaOrigem, char escalaDestino)
Neste método,deve implementar a conversão completa entre duas escalas
informadas, como Celsius, Fahrenheit e Kelvin.
Requisitos:
A classe deve trabalhar com diferentes escalas de temperatura.
Os métodos devem representar diferentes formas de realizar a conversão.
*/

public class Ex7 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 7 ---\n");

        ConversorTemperatura conv = new ConversorTemperatura();

        System.out.println("25°C em Fahrenheit:");
        System.out.println(conv.converter(25));

        System.out.println("\n77°F em Celsius:");
        System.out.println(conv.converter(77, 'F'));

        System.out.println("\n300K em Celsius:");
        System.out.println(conv.converter(300, 'K'));

        System.out.println("\n25°C em Kelvin:");
        System.out.println(conv.converter(25, 'C', 'K'));

        System.out.println("\n300K em Fahrenheit:");
        System.out.println(conv.converter(300, 'K', 'F'));
    }
}