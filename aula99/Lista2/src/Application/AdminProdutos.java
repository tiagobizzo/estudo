package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class AdminProdutos {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Produtos> list = new ArrayList<>();

        System.out.print("Quantos produtos diferentes serão cadastrados? ");
        int tot = sc.nextInt();

        for(int i = 0; i < tot; i++){

            System.out.println("Registro #" + (i+1));

            System.out.print("Digite a referência do produto: ");
            Integer ref = sc.nextInt();

            System.out.print("Digite o nome do produto: ");
            sc.nextLine(); //para ir para próxima linha e armazenar a resposta digitada
            String name = sc.nextLine();

            System.out.print("Digite o valor do produto: ");
            Double valor = sc.nextDouble();

            Produtos prod = new Produtos(ref, name, valor);
            list.add(prod);

            System.out.println();

        }

        System.out.println("-------------------------");
        System.out.print("Digite a referência do produto que irá aumentar de valor: ");
        int buscaRef = sc.nextInt();
        System.out.println();

        Produtos prod = list.stream().filter(x -> x.getRef() == buscaRef).findFirst().orElse(null);
        if(prod == null){
            System.out.println("Referência inválida! Produto não localizado.");
        }
        else{
            System.out.print("Digite o percentual do aumento: ");
            double percentAumento = sc.nextDouble();
            prod.aumentarValor(percentAumento);
        }

        System.out.println();
        System.out.println("Lista de produtos atualizados:");
        for(Produtos cad : list){
            System.out.println(cad);
        }


        sc.close();

    }
    
}
