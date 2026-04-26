package entities.ex2;

public class ProdutoEletronico {
    private String nome;
    private double preco;
    private String marca;
    private int garantiaMeses;
    

    public ProdutoEletronico(String nome, double preco, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.garantiaMeses = 6;
    }
    
    public ProdutoEletronico(String nome, double preco, String marca, int garantiaMeses) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }


    public String exibirDetalhes(){
        return "Nome: " + nome +
           "\nMarca: " + marca +
           "\nPreço: R$ " + preco +
           "\nGarantia: " + garantiaMeses + " meses";
    }

    public String exibirDetalhes(boolean incluirGarantia){
        if (incluirGarantia) {
            return exibirDetalhes();
        } else {
            return "Nome: " + nome +
                "\nMarca: " + marca +
                "\nPreço: R$ " + preco;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
}
