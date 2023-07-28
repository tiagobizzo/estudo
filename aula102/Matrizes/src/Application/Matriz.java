package Application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz{

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da matriz: ");
        int l = sc.nextInt();
        System.out.print("Digite a quantidade de colunas da matriz: ");
        int c = sc.nextInt();

        //criando a matriz
        int[][] mat = new int[l][c];

        System.out.println("-------------");

        //montar a matriz
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print("Linha " + i + " e coluna " + j + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("-------------");

        //mostrar a matriz
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-------------");

        sc.close();

        
    }

}