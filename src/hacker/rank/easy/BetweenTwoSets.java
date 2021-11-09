package hacker.rank.easy;


import java.util.Scanner;

public class BetweenTwoSets {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int tamanioArregloA = in.nextInt();
        int tamanioArregloB = in.nextInt();
        boolean flag = true;

        int arregloA[] = new int[tamanioArregloA];
        int arregloB[] = new int[tamanioArregloB];
        int resArregloA[] = new int[100];
        int count = 0;
        int contador = 0;

        for (int i = 0; i < tamanioArregloA; i++) {
            arregloA[i]    = in.nextInt();
        }

        for (int i = 0; i < tamanioArregloB; i++) {
            arregloB[i]    = in.nextInt();
        }

        for (int i = 1; i <= 100; i++) {
            flag = true;
            for (int j = 0; j < tamanioArregloA; j++) {

                if(i % arregloA[j] != 0) {

                    flag = false;
                    break;

                }

            }


            for (int j = 0; j < tamanioArregloB; j++) {
                if(arregloB[j] % i != 0) {

                    flag = false;
                    break;

                }

            }
            if(flag == true) {
                count++;
            }


        }

        System.out.println(count);

    }

}