package Medidas;

public class Retangulo {

    public double largura;
    public double altura;


    public double calcArea(){
        return largura * altura;
    }

    public double calcPermietro(){
        return 2 * ( largura + altura);
    }

    public double calcDiagonal(){
        double w = Math.pow(altura, 2);
        double h = Math.pow(largura, 2);
        return Math.sqrt( (w + h));
    }
    
}
