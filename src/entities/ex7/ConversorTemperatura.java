package entities.ex7;

public class ConversorTemperatura {

    public double converter(double celsius){
        return (celsius * 9/5) + 32;
    }

    public double converter(double valor, char escalaOrigem){
        escalaOrigem = Character.toUpperCase(escalaOrigem);

        switch (escalaOrigem) {
            case 'C':
                return valor;
            case 'F':
                return (valor - 32) * 5/9;
            case 'K':
                return valor - 273.15;
            default:
                throw new IllegalArgumentException("Escala inválida");
        }
    }

    public double converter(double valor, char escalaOrigem, char escalaDestino){
        escalaOrigem = Character.toUpperCase(escalaOrigem);
        escalaDestino = Character.toUpperCase(escalaDestino);

        double celsius = converter(valor, escalaOrigem);

        switch (escalaDestino) {
            case 'C':
                return celsius;
            case 'F':
                return (celsius * 9/5) + 32;
            case 'K':
                return celsius + 273.15;
            default:
                throw new IllegalArgumentException("Escala inválida");
        }
    }
}
