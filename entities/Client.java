package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

    private String name;
    private String email;
    private Date birthDate;


    // CONSTRUTORES 
    public Client() {
    }

    public Client (String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    // ENCAPSULAMENTO

    // METODOS
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: " + name + "(" + birthDate + ")" + " - " + email);
        return sb.toString();
    }

}
