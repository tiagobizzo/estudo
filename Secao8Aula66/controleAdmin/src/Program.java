import java.util.Scanner;
import entities.Product;

public class Program{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        
        System.out.println("Entre com os dados:");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade no estoque: ");
        product.quantity = sc.nextInt();
        
        System.out.println();
        System.out.println(product);
        System.out.println();

        System.out.println("Adicione a quantidade de produtos ao estoque:");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Update dados: " + product);

        System.out.println();
        System.out.println("Retire a quantidade de produtos ao estoque:");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println();
        System.out.println("Update dados: " + product);

        sc.close();

    }

}