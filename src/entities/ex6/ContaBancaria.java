package entities.ex6;

public class ContaBancaria {
    
    private String numeroConta;
    private String titular;
    private double saldo;
    private String tipoConta;
    private String ultimaDescricao;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0;
        this.tipoConta = "corrente";
    }

    public ContaBancaria(String numeroConta, String titular, String tipoConta) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.tipoConta = tipoConta;
        this.saldo = 0;
    }

    public ContaBancaria(String numeroConta, String titular, String tipoConta, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void depositar(double valor){
        if (valor <= 0) return;
        saldo += valor;
    }

    public void depositar(double valor, String descricao){
        if (valor <= 0) return;
        saldo += valor;
        this.ultimaDescricao = descricao;
    }

    public boolean sacar(double valor){
        if (valor <= 0) return false;

        double valorFinal = valor;

        if (tipoConta.equalsIgnoreCase("poupanca")) {
            valorFinal += valor * 0.005;
        }

        if (saldo >= valorFinal) {
            saldo -= valorFinal;
            return true;
        }

        return false;
    }

    public boolean sacar(double valor, double taxaExtra){
        if (valor <= 0 || taxaExtra < 0) return false;

        double valorFinal = valor;

        if (tipoConta.equalsIgnoreCase("poupanca")) {
            valorFinal += valor * 0.005;
        }

        valorFinal += taxaExtra;

        if (saldo >= valorFinal) {
            saldo -= valorFinal;
            return true;
        }

        return false;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getUltimaDescricao() {
        return ultimaDescricao;
    }

    public void setUltimaDescricao(String ultimaDescricao) {
        this.ultimaDescricao = ultimaDescricao;
    }
}
