import java.util.Scanner;

import Medidas.Retangulo;

public class Program{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        

        System.out.println("Digite o valor da altura do retangulo:");
        retangulo.altura = sc.nextDouble();
        
        System.out.println("Digite o valor da largura do retangulo:");
        retangulo.largura = sc.nextDouble();
        
        System.out.println();
        System.out.println("Área: " + retangulo.calcArea());

        System.out.println();
        System.out.println("Perímetro: " + retangulo.calcPermietro());

        System.out.println();
        System.out.println("Diagonal: " + retangulo.calcDiagonal());

    }
}