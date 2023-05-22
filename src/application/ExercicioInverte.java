package application;

import javax.swing.JOptionPane;

public class ExercicioInverte {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, inverte(palavra));
    }
    public static String inverte(String palavra) {
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        return palavraInvertida;
    }
}
