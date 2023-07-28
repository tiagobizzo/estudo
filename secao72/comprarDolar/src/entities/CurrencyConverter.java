package entities;

public class CurrencyConverter {
    
    public static final double IOF = 0.06;

    public double valorDolar;
    public double comprarDolares;
    
    public double calcCompraDoDolar(){
        return (valorDolar * comprarDolares) + (valorDolar * comprarDolares * IOF);
    }

}
