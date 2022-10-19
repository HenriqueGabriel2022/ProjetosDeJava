package br.edu.ifgoiano.aluno.Henrique.FuncaoClasseFora;

public class DescobrindoOMaior {
    public void MaiorTermo( int a1, int a2, int a3){

        if (a1 >= a2 && a1 >= a3){
            System.out.println("O maior é " + a1);
        } else if (a2 >= a1 && a2 >= a3) {
            System.out.println("O maior é "+ a2);
        } else {
            System.out.println("O maior é " + a3);
        }

    }
}
