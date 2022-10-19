package br.edu.ifgoiano.aluno.Henrique.FuncaoClasseFora;

public class ClasseSecundaria {

    public void FatorialDeNumero(int n) {
        for (int i = n; i >= 1; i--) {
            int fatorialContralador = 1;
            fatorialContralador = fatorialContralador * i;
            System.out.println(fatorialContralador);
        }

    }
}
