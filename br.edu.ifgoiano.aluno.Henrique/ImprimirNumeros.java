package br.edu.ifgoiano.aluno.Henrique;

public class ImprimirNumeros {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i == 3){
                continue;
            } else if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
