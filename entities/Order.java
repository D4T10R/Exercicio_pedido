package entities;

import entities.enums.OrderStatus;
import entities.Client;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Order {

    private Date moment;
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
    // METODOS


}