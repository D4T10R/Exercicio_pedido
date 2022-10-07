package entities;

public class OrderItem {
    
    private Product product;

    private Integer quantity;
    private Double price;

    // CONSTRUTOR
    public OrderItem(Product product, Integer quantity, Double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    // ENCAPSULAMENTO
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getQuantity() {
        return quantity;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Double getPrice() {
        return price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public Product getProduct() {
        return product;
    }
    // ENCAPSULAMENTO


    // METODOS
    public double subTotal() {
        Double sum = quantity * price;
        return sum;
    }

    public String toString() {
        return getProduct().getName()
				+ ", $"
				+ String.format("%.2f", price)
				+ ", Quantity: "
				+ quantity
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
    }


}
