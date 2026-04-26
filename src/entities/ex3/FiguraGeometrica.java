package entities.ex3;

public class FiguraGeometrica {

    public double calcularArea(double lado){
        return Math.pow(lado, 2);
    }

    public double calcularArea(double base, double altura){
        return base*altura;
    }

    public double calcularArea(double raio, boolean circulo){
        return Math.PI * Math.pow(raio, 2);
    }

    public double calcularPerimetro(double lado){
        return lado*4;
    }

    public double calcularPerimetro(double base, double altura){
        return (base*2)+(altura*2);
    }

    public double calcularPerimetro(double raio, boolean circulo){
        return 2*Math.PI*raio;
    }
}
