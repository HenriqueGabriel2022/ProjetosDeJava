package br.edu.ifgoiano.aluno.Henrique;

public class UsandoVetor {
    public static void main(String[] args) {
        int [] vetor = new int [4];

        for (int i = 0; i < 4; i++){
            vetor[i] = i;
            vetor[i] *= vetor[i];
            System.out.println(vetor[i]);
        }

        System.out.println("O Código Rodou.");

    }
}
