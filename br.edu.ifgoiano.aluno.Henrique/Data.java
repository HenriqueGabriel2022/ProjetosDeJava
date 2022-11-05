package br.edu.ifgoiano.aluno.Henrique;

import javax.swing.*;


public class Data {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia ?"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês?"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano ?"));

        System.out.println(dia
         + "/" + mes + "/" + ano);

    }
}
