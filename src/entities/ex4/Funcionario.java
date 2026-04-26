package entities.ex4;

public class Funcionario {

    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.salario = 1621.0;
        this.cargo = cargo;
    }

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public void aumentarSalario(double percentual){
        salario = salario*(1 + percentual/100);
    }

    public void aumentarSalario(double valorFixo, boolean aumentoFixo){
        salario += valorFixo;
    }

    public String exibirDetalhes(){
        return "Nome: " + nome +
           "\nSalário: R$ " + salario +
           "\nCargo: " + cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
