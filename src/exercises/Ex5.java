package exercises;

import java.util.Scanner;

import entities.ex5.ReservaHotel;

/* 
5. Classe ReservaHotel
Crie uma classe chamada ReservaHotel com os atributos hospede, quarto,
dias, cafeDaManha, valorDiaria e quantidadeHospedes.
ReservaHotel(String hospede, int quarto, int dias, boolean cafeDaManha,
double valorDiaria, int quantidadeHospedes)
Neste construtor, você deve criar a reserva com todas as informações
completas, inicializando todos os atributos com os valores recebidos por
parâmetro.
ReservaHotel(String hospede, int quarto, int dias, double valorDiaria, int
quantidadeHospedes)
Neste construtor, você deve criar a reserva sem receber a informação do
café da manhã. Nesse caso, deve considerar um valor padrão para esse
atributo, assumindo que a reserva não inclui café da manhã.
ReservaHotel(String hospede, int quarto, double valorDiaria)
Neste construtor, você deve criar a reserva sem receber a quantidade de
dias, a informação do café da manhã e a quantidade de hóspedes. Você
deve assumir valores padrão coerentes, como por exemplo 1 dia de
hospedagem, sem café da manhã e 1 hóspede.
double calcularValorTotal()
Neste método, você deve calcular o valor total da reserva considerando a
quantidade de dias, o valor da diária, a quantidade de hóspedes e as regras
adicionais da hospedagem.
double calcularValorTotal(double taxaAdicional)
Neste método, você deve calcular o valor total da reserva considerando as
mesmas regras do método anterior, mas acrescentando também uma taxa
extra recebida por parâmetro ao valor final. Essa taxa adicional deve ser
somada apenas uma vez ao valor final da reserva.
Regras:
O valor base da reserva deve ser calculado multiplicando o valor da diária
pela quantidade de dias.
Se cafeDaManha for verdadeiro, a diária deve sofrer acréscimo de 20%. Esse
acréscimo deve ser aplicado primeiro sobre o valor da diária e, somente
depois, o resultado deve ser multiplicado pela quantidade de dias.
A reserva deve considerar também a quantidade de hóspedes. Até 2 hóspedes,
não deve haver cobrança extra. A partir do 3o hóspede, deve ser cobrada
uma taxa adicional de 50 reais por hóspede excedente, por dia de
hospedagem.
Exemplo de regra: se houver 4 hóspedes, então existem 2 hóspedes
excedentes. Nesse caso, você deve cobrar o valor adicional
correspondente a esses 2 hóspedes, multiplicado pela quantidade de dias.
No método calcularValorTotal(double taxaAdicional), a taxa adicional
informada por parâmetro deve ser somada ao valor final da reserva depois
da aplicação de todas as demais regras.
Se alguns dados não forem informados no construtor, devem ser assumidos
valores padrão adequados.
Você deve validar os dados da reserva. A quantidade de dias não pode ser
menor que 1, o valor da diária não pode ser menor ou igual a zero e a
quantidade de hóspedes não pode ser menor que 1.
O atributo quarto deve ser armazenado como identificação do quarto
reservado, mas não interfere no cálculo do valor da hospedagem.
*/

public class Ex5 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 5 ---\n");

        ReservaHotel r1 = new ReservaHotel("Ana", 101, 3, true, 200.0, 2);
        ReservaHotel r2 = new ReservaHotel("Carlos", 202, 4, 150.0, 3);
        ReservaHotel r3 = new ReservaHotel("Beatriz", 303, 180.0);

        System.out.println("Reserva 1 (com café, 2 hóspedes):");
        System.out.println("Total: R$ " + r1.calcularValorTotal());

        System.out.println("\nReserva 2 (sem café, 3 hóspedes):");
        System.out.println("Total: R$ " + r2.calcularValorTotal());

        System.out.println("\nReserva 3 (valores padrão):");
        System.out.println("Total: R$ " + r3.calcularValorTotal());

        System.out.println("\nReserva 2 com taxa adicional de R$ 100:");
        System.out.println("Total: R$ " + r2.calcularValorTotal(100));    
    }
}