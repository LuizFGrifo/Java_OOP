package application;

public class Foreach {
    public static void main(String[] args) {
        String[] vect = new String[] {"Luiz", "Maria", "Alexandre"};

        for(int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("---------------- Laço com for each ----------------");

        for(String nome : vect) {
            System.out.println(nome);
        }
    }
}
