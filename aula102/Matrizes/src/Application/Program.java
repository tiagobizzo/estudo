package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de linhas e colunas:");
        int n = sc.nextInt();
        int[][] mat = new int[n][n]; //[][] isso significa que é uma matriz bidimencional.

        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print("Digite o valor da linha: " + i + " e da coluna " + j + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("-----------------------------------------");

        //mostrar a matriz
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------");
        
        //mostrar os valores da diagonal principal
        System.out.println("Diagonal Principal:");
        for(int i = 0; i < mat.length; i++){
            System.out.print(mat[i][i] + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------");

        //mostrar a qtd de números negativos
        int count = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.println("Total de números negativos: " + count);
        System.out.println("-------------------FIM-------------------");

        sc.close();

    }

}