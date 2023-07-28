package Application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p = new Product();

        System.out.print("Digite o nome: ");
        String name = sc.nextLine();
        p.setName(name);

        System.out.println();
        System.out.print("Digite o preço: ");
        double valor = sc.nextDouble();
        p.setPrice(valor);

        System.out.println();
        System.out.print("Digite a quantidade em estoque: ");
        int qtd = sc.nextInt();
        p.setQuantty(qtd);

        System.out.println();
        System.out.println("Nome: " + p.getName());
        System.out.println("Preço: " + p.getPrice());
        System.out.println("Quantidade: " + p.getQuantity());

    }

}