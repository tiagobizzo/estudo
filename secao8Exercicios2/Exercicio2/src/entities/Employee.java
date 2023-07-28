package entities;

public class Employee{

    public String name;
    public double grossSalary;
    public double tax;
    public double percentIncrementalSalario;

    public String nomeFuncionario(){
        return name;
    }

    public double salarioBruto(){
        return grossSalary;
    }

    public double taxa(){
        return tax;
    }

    public double salarioComDesconto(){
        return grossSalary - tax;
    }

    public double incrementarSalario(){
        double salarioDescontado = grossSalary - tax;
        return salarioDescontado + (grossSalary * (1 / percentIncrementalSalario));
    }

}