package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(String name, double price, int quantity) { // Construtor
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) { // Construtor sobrecarregado
        this.name = name;
        this.price = price;
    }

    public String getName() { // Para retonrar o valor de name
        return name;
    }

    public void setName(String name) { // Para alterar o atributo name
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Começamos com o nome do método em minúsculo
    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public String toString() {
        return name + ", $ "
                + String.format("%.2f", price)
                + ", " + quantity + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
