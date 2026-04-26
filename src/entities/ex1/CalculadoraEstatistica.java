package entities.ex1;

public class CalculadoraEstatistica {

    private int[] numeros;
    
    public CalculadoraEstatistica(){}

    public CalculadoraEstatistica(int[] numeros){
        this.numeros = numeros;
    }
    
    public double calcularMedia(int a, int b){
        double resultado = (a + b)/2.0;
        return resultado;
    }

    public double calcularMedia(int a, int b, int c){
        double resultado = (a + b + c)/3.0;
        return resultado;
    }

    public double calcularMedia(int[] numeros){

        double resultado = 0;
        for (int nums : numeros) {
            resultado += nums;
        }
        
        return resultado/numeros.length;
    }

    public double calcularMedia(){
        return calcularMedia(this.numeros);
    }
}
