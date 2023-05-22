package application;

import javax.swing.JOptionPane;

public class ExercicioContaVogais {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Digite uma palavra: ");
        JOptionPane.showMessageDialog(null, contaVogias(texto));
    }

    public static int contaVogias(String texto) {
        texto = texto.toLowerCase();

        int vogais = 0;

        for(int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            }
        }
        return vogais;
    }
}
