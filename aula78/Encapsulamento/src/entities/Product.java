package entities;

public class Product {
    
    private String name;
    private double price;
    private int quantity;


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void setQuantty(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

}
