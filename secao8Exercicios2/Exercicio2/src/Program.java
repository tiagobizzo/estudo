import java.util.Scanner;

import entities.Employee;

public class Program{

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        
        System.out.print("Digite o nome do funcionário: ");
        employee.name = sc.nextLine();
        System.out.println();
        System.out.print("Digite o salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println();
        System.out.print("Digite a taxa: ");
        employee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Nome: " + employee.name);
        System.out.println("Salário Bruto: " + String.format("%.2f", employee.grossSalary));
        System.out.println("Taxa: " + String.format("%.2f", employee.tax));

        System.out.println();
        System.out.println("Funcionário: " + employee.nomeFuncionario() + ", $ " + String.format("%.2f",employee.salarioComDesconto()));

        System.out.println();
        System.out.println("Digite o percentual de aumento do salário: ");
        employee.percentIncrementalSalario = sc.nextDouble();

        System.out.println();
        System.out.println("Dados atualizados: " + employee.nomeFuncionario() + ", $ " + String.format("%.2f", employee.incrementarSalario()));

    }

}