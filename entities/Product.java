package entities;

public class Product {
    
    private String name;
    private Double price;

    // CONSTRUTORES
    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    // CONSTRUTORES 


    // ENCAPSULAMENTO 
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }

}
