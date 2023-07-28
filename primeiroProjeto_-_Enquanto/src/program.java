import java.util.Locale;
import java.util.Scanner;
import entities.triangle;

public class program {
    
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        triangle x, y;
        x = new triangle();
        y = new triangle();

        System.out.println("Digite o valor dos lados do Triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite o valor dos lados do Triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangulo X area: %.4f%n", areaX);
        System.out.printf("Traingulo Y area: %.4f%n", areaY);

        if(areaX > areaY){
            System.out.println("Maior área é o X.");
        }
            else{
                System.out.println("Maior área é o Y.");
            }
        
    }

}
