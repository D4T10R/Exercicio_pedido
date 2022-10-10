package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<OrderItem> items = new ArrayList<>();

        // CLIENTE SENDO ADICIONADO
        System.out.println("Enter Cliente Data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());

        Client cliente = new Client(name, email, birthDate);

        // ORDER SENDO ADICIONADO
        System.out.println("\nEnter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, cliente);


        System.out.println("How many items to this order? ");
        int quant = sc.nextInt();

        // ORDER_ITEM E PRODUCT SENDO ADICIONADO 
        for (int i = 0; i < quant; i++) {

            System.out.println("\nEnter #" + (i+1) + " Item data: ");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(product, quantity, productPrice);

            order.addItem(orderItem);

        }


        // EXIBIÇÃO
        System.out.println("\n" + order);



    }

}
