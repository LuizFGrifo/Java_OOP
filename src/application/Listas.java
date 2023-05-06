package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Luiz");
        list.add("Alexandre");
        list.add(2, "Afonso"); // Para colocar na posição 2

        System.out.println(list.size()); // Tamanho da lista

        for(String names : list) {
            System.out.println(names);
        }

        System.out.println("-------------------");
        // list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'A'); // Função lambda

        for(String names : list) {
            System.out.println(names);
        }

        System.out.println("-------------------");
        System.out.println("Index of Luiz: " + list.indexOf("Luiz"));
        System.out.println("Index of Naomi: " + list.indexOf("Laranja Naomi"));

        list.add("Ana");
        list.add("Alana");
        list.add("Amanda");

        System.out.println("-------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for(String name : result) {
            System.out.println(name);
        }

        System.out.println("-------------------");
        String name = list.stream().filter(x-> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println(name);
    }
}
