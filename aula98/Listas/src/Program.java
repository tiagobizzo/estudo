import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program{


    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        System.out.println(list.size()); //mostrar tamanho da lista

        //percorrer toda a lista e mostrar na tela cada item
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("---------------------");
        System.out.println("Deletando o nome cujo primeira letra é = M");
        list.removeIf(x -> x.charAt(0) == 'M'); //deletar da lista o nome que iniciar com M
        for(String x : list){
            System.out.println(x);
        }

        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("---------------------");
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
        System.out.println("Mostrar somente quem começa com a letra A");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //converte a lista para stream, faz a operação lambda e depois a converte para lista

        for(String x : result){
            System.out.println(x);
        }

        System.out.println("---------------------");
        System.out.println("Mostrar o primeiro elemento que começa com a letra A");
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
            System.out.println(name);

        sc.close();

    }

}