package application;

import javax.swing.JOptionPane;
public class ExercicioIsPalindromo {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma palavra ");
        JOptionPane.showMessageDialog(null, isPalindromo(texto));
    }

    public static boolean isPalindromo(String texto) {

        texto = texto.toLowerCase();
        String textoInvertido = new StringBuilder(texto).reverse().toString();

        if(texto.equals(textoInvertido)) {
            return true;
        }

        return false;
    }
}
