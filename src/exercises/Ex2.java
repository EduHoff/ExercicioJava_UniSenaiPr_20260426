package exercises;

import java.util.Scanner;

import entities.ex2.ProdutoEletronico;

/* 
2. Classe ProdutoEletronico
Crie uma classe chamada ProdutoEletronico com os atributos nome, preco,
marca e garantiaMeses.
ProdutoEletronico(String nome, double preco, String marca)
Neste construtor, deve criar um produto informando apenas nome, preço e
marca. A garantia deve receber um valor padrão definido na
implementação.
ProdutoEletronico(String nome, double preco, String marca, int garantiaMeses)
Neste construtor, deve criar o produto já informando também a quantidade
de meses de garantia.
String exibirDetalhes()
Neste método, deve retornar ou montar uma String com as informações
básicas do produto.
String exibirDetalhes(boolean incluirGarantia)
Neste método, deve retornar ou montar uma String com os dados do
produto e decidir, com base no valor do parâmetro, se a garantia será
exibida ou não.
Requisitos:
Os atributos devem ser inicializados corretamente.
A sobrecarga deve representar formas diferentes de criar e exibir o produto.
*/

public class Ex2 implements Exercise {

    @Override
    public void run(Scanner sc) {
        System.out.println("--- Exercício 2 ---\n");

        ProdutoEletronico p1 = new ProdutoEletronico("Celular", 1500.0, "Samsung");
        ProdutoEletronico p2 = new ProdutoEletronico("Notebook", 3500.0, "Dell", 12);

        System.out.println("Produto 1 (detalhes completos):");
        System.out.println(p1.exibirDetalhes());

        System.out.println("\nProduto 1 (sem garantia):");
        System.out.println(p1.exibirDetalhes(false));

        System.out.println("\nProduto 2 (detalhes completos):");
        System.out.println(p2.exibirDetalhes());

        System.out.println("\nProduto 2 (com garantia explicitamente):");
        System.out.println(p2.exibirDetalhes(true));
    }
}