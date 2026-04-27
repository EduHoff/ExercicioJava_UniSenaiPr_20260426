package entities.ex5;

public class ReservaHotel {

    private String hospede;
    private int quarto;
    private int dias;
    private boolean cafeDaManha;
    private double valorDiaria;
    private int quantidadeHospedes;
    
    public ReservaHotel(String hospede, int quarto, int dias, boolean cafeDaManha, double valorDiaria,
            int quantidadeHospedes) {
        validarDados(dias, valorDiaria, quantidadeHospedes);
        this.hospede = hospede;
        this.quarto = quarto;
        this.dias = dias;
        this.cafeDaManha = cafeDaManha;
        this.valorDiaria = valorDiaria;
        this.quantidadeHospedes = quantidadeHospedes;
    }

    public ReservaHotel(String hospede, int quarto, int dias, double valorDiaria, int quantidadeHospedes) {
        validarDados(dias, valorDiaria, quantidadeHospedes);
        this.hospede = hospede;
        this.quarto = quarto;
        this.dias = dias;
        this.cafeDaManha = false;
        this.valorDiaria = valorDiaria;
        this.quantidadeHospedes = quantidadeHospedes;
    }

    public ReservaHotel(String hospede, int quarto, double valorDiaria) {
        validarDados(1, valorDiaria, 1);
        this.hospede = hospede;
        this.quarto = quarto;
        this.dias = 1;
        this.cafeDaManha = false;
        this.valorDiaria = valorDiaria;
        this.quantidadeHospedes = 1;
    }

    private void validarDados(int dias, double valorDiaria, int quantidadeHospedes) {
        if (dias < 1) throw new IllegalArgumentException("Dias inválidos");
        if (valorDiaria <= 0) throw new IllegalArgumentException("Diária inválida");
        if (quantidadeHospedes < 1) throw new IllegalArgumentException("Hóspedes inválidos");
    }

    public double calcularValorTotal(){
        
        double valorDiaria = this.valorDiaria;

        if(cafeDaManha){
            valorDiaria *= 1.2;    
        }

        double base = valorDiaria * dias;

        if(quantidadeHospedes <= 2){
            return base;
        }

        double taxaHospede = (quantidadeHospedes-2) * 50 * dias;

        return base + taxaHospede;
    }

    public double calcularValorTotal(double taxaAdicional){
        return calcularValorTotal() + taxaAdicional;
    }

    public String getHospede() {
        return hospede;
    }

    public void setHospede(String hospede) {
        this.hospede = hospede;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public boolean getCafeDaManha() {
        return cafeDaManha;
    }

    public void setCafeDaManha(boolean cafeDaManha) {
        this.cafeDaManha = cafeDaManha;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getQuantidadeHospedes() {
        return quantidadeHospedes;
    }

    public void setQuantidadeHospedes(int quantidadeHospedes) {
        this.quantidadeHospedes = quantidadeHospedes;
    }
}
