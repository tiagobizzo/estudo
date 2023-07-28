package entities;

public class Produtos {

    private Integer ref;
    private String name;
    private Double valor;

    public Produtos(int ref, String name, double valor){

        this.ref = ref;
        this.name = name;
        this.valor = valor;

    }

    public int getRef(){
        return ref;
    }

    public void setRef(int ref){
        this.ref = ref;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void aumentarValor(double aumento){
        this.valor += this.valor * (aumento / 100);
    }

    public String toString(){
        return ref + ", " + name + ", " + String.format("%.2f", valor);
    }
    
}
