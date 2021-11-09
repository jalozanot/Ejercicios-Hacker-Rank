package hacker.rank.easy;

import java.util.Scanner;

public class DivisibleSumPairs {


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int tamanio = in.nextInt();
        int k = in.nextInt();
        int arreglo[] = new int[tamanio];
        int suma = 0;
        int count = 0;

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = in.nextInt();
        }

        for (int i = 0; i < tamanio; i++) {

            for (int j = 0 + i + 1; j < tamanio; j++) {
                suma = 0;

                suma = arreglo[i] + arreglo[j];


                if(suma % k == 0) {
                    count ++;
                }

            }

        }
        System.out.println(count);
    }






}