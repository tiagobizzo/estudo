package Application;

import java.util.Locale;
import java.util.Scanner;
import Entities.Pessoas;

public class Program{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas: ");
        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];

        for(int i=0; i < vect.length; i++){
            sc.nextLine();
            int x = i + 1;
            System.out.print("Digite o nome da " + x + "a pessoa: ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade da " + x + "a pessoa: ");
            int idade = sc.nextInt();
            System.out.print("Digite o peso da " + x + "a pessoa: ");
            double peso = sc.nextDouble();

            vect[i] = new Pessoas(nome, idade, peso);

        }

        double mediaIdade = 0.0;
        double mediaPeso = 0.0;
        for(int i = 0; i < vect.length; i++){
            mediaIdade += vect[i].getIdade();
            mediaPeso += vect[i].getPeso();
        }

        System.out.printf("Média de idade: %.2f%n", mediaIdade / vect.length);
        System.out.printf("Média de peso: %.2f%n", mediaPeso / vect.length);

    }

}