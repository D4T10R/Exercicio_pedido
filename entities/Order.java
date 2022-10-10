package entities;

import entities.enums.OrderStatus;
import entities.Client;

import java.util.List;
import java.util.spi.ToolProvider;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {

    private Date moment;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();  


    // CONSTRUTORES
    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        super();
        this.moment = moment;
        this.status = status;
        this.client = client;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO 
    public void setMoment(Date moment) {
        this.moment = moment;
    }
    public Date getMoment() {
        return moment;
    }

    public void setSatus(OrderStatus status) {
        this.status = status;
    }
    public OrderStatus getStatus() {
        return status;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public Client getClient() {
        return client;
    }
    // ENCAPSULAMENTO

    // METODOS 
    public void addItem(OrderItem items) {
        this.items.add(items);
    }
    public void removeItem(OrderItem items) {
        this.items.remove(items);
    }

    public Double total() {
        Double sum = 0.0;
        for (OrderItem it : items) {
            sum += it.subTotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY");
        sb.append("\nOrder moment: " + sdf.format(moment));
        sb.append("\nOrder status: " + status);
        sb.append("\n" + client + "\n");
        sb.append("\nOrder items: \n");
        sb.append("\n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("\n Total price: R$" + total());
        return sb.toString();
    }
    // METODOS


}