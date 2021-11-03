package hacker.rank.easy;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tamanioArr = in.nextInt();
        int diagonalA = 0;
        int diagonalB = 0;
        int [][]arreglo = new int[tamanioArr][tamanioArr];

        for (int i = 0; i < tamanioArr; i++) {
            for (int j = 0; j < tamanioArr; j++) {
                arreglo[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < tamanioArr; i++) {
            for (int j = 0; j < tamanioArr; j++) {
                if(i == j) {
                    diagonalA = diagonalA + arreglo[i][j];
                }
                if(j == tamanioArr - i - 1){
                    diagonalB = diagonalB + arreglo[i][j];
                }

            }
        }

        int resultado = Math.abs(diagonalA - diagonalB);
        System.out.println(resultado);

    }


}
