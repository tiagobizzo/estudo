package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.funcionario;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<funcionario> list = new ArrayList<>();

        System.out.print("Quantos funcionarios serão cadastrados? ");
        int tot = sc.nextInt();

        for(int i = 0; i < tot; i++){

            System.out.println("Emplyoee #" + (i+1) + ": ");

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            funcionario emp = new funcionario(id, name, salary);
            list.add(emp);
            
            System.out.println();

        }

        System.out.println("-----------------");
        System.out.println("Digite o ID do funcionário que terá aumento salarial: ");
        int idFunc = sc.nextInt();
        
        //funfionario emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        Integer pos = position(list, idFunc);
        if(pos == null){
            System.out.println("Esse id não existe!");
        }
        else{
            System.out.println("Digite o percentual do  aumento salarial: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("-----------------");

        System.out.println("Lista de funcionários:");
        for(funcionario emp : list){
            System.out.println(emp);
        }

        System.out.println("--------FIM---------");

        sc.close();
        
    }

    public static Integer position(List<funcionario> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
    
}
