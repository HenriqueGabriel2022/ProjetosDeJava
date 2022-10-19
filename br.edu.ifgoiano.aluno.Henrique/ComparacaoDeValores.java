package br.edu.ifgoiano.aluno.Henrique;

import javax.swing.*;

public class ComparacaoDeValores {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int valorDoTeclado = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor para ver se é negativo ou não"));
            if (valorDoTeclado < 0){
                break;
            }
        }
    }
}
