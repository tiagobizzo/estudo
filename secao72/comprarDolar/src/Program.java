import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program{

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        CurrencyConverter cc = new CurrencyConverter();

        System.out.print("Qual o valor do dolar atual? ");
        cc.valorDolar = sc.nextDouble();

        System.out.println();
        System.out.print("Quantos dólares deseja comprar? ");
        cc.comprarDolares = sc.nextDouble();

        System.out.println();
        System.out.printf("Você vai precisar de R$ %.2f%n", cc.calcCompraDoDolar());


    }

}