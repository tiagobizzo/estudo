package entities;

public class Product {
    
    public String name;
    public double price;
    public int quantity; //atributo da classe


    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProduct(int quantity){
        this.quantity += quantity; //o this aponta para o atributo da classe
    }

    //public void é quanto a função não tem nenhum retorn
    public void removeProduct(int quantity){
        this.quantity -= quantity;
    }

    //alterando a Stringo default do objeto
    public String toString(){
        return name
                + ", $ " 
                + String.format("%.2f", price) 
                + ", " 
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }

}
