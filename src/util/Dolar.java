package util;

public class Dolar {
    public static double price;
    public static double bought;

    public static double amount() {
        double total = price * bought;
        double iof = total + (total * 6 / 100);
        return iof;
    }
}
