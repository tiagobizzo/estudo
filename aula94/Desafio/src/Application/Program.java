package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos seão alugados: ");
        int quartos = sc.nextInt();
        Aluguel[] vect = new Aluguel[10];

        for(int i = 1; i <= quartos; i++){
            System.out.println();
            System.out.println("Rent #" + i);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();

            System.out.print("E-mail: ");
            String email = sc.nextLine();

            System.out.print("Número do quarto: ");
            int numQuarto = sc.nextInt();

            vect[numQuarto] = new Aluguel(nome, email);
        }

        System.out.println();
        System.out.println("Quartos: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] != null){
                System.out.println(i + ": " + vect[i]);
            }
        }

        //Aluguel al = new Aluguel("Tiago Bizzo", "tiago.bizzo@gmail.com");
        //System.out.println(aluguel);



        sc.close();

    }

}
