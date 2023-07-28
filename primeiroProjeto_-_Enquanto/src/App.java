import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
        //int x = 0;
        //int y = 4;
        //int n;
        //chamar o método somar
        //somar(x,y);

        //chamar o método loop
        //loop(x,y);

        //chamadno o for
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Digite um valor de repetição:");
        //n = sc.nextInt();
        //repeticaoFor(n);
        //sc.close();

        //chamando o do While
        facaEnquanto();

    }

    public static void somar(int num1, int num2){

        int soma;
        soma = num1 + num2;
        System.out.println("A soma é: " + soma);

    }

    public static void loop (int x1, int x2){

        while (x1 < x2){
            int xx;
            xx = x1 + x2;
            System.out.println("O valor de " + x1 + " + " + x2 + " é igual a: " + xx);
            x1+=1;
        }

    }

    public static void repeticaoFor(int rec1){

        int soma = 0;
        for(int i=0; i < rec1; i++){
            System.out.println("O valor de i é: " + i);
            soma = soma + i;
            System.out.println("O valor da soma é: " + soma);
        }

    }

    public static void facaEnquanto(){

        int d;
        char r;
        d = 0;

        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Digite um valor em metro, para converter em centímetro:");
            d = sc.nextInt();
            System.out.println("Valor em centímetro: " + (d * 100) + " centímetros.2");

            System.out.println("Deseja continuar (s/n)?");
            r = sc.next().charAt(0);

        }while( r != 'n');

        sc.close();

    }

}
