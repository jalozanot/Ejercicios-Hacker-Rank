package hacker.rank.easy;

import java.util.Scanner;

public class CircularArrayRotation {

    public static void main(String... args) {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int k = entrada.nextInt();
        int q = entrada.nextInt();
        int[] arr = new int[n];
        int[] arrIndex = new int[q];
        int[] arrAux = new int[n];
        int kAux = 0;
        int valPos = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = entrada.nextInt();
        }

        for (int i = 0; i < q; i++) {
            arrIndex[i] = entrada.nextInt();
        }

        if(k > n) {
            for (int i = 0; i < n; i++) {

                if(i+k < n ) {
                    valPos = i + k;
                    arrAux[valPos] = arr[i];
                }else {
                    valPos = ((i+k)) % n;
                    arrAux[valPos] = arr[i];
                }


            }
        }else {

            for (int i = 0; i < n; i++) {

                if(i+k < n ) {
                    valPos = i + k;
                    arrAux[valPos] = arr[i];
                }else {
                    valPos = ((i+k)) - n;
                    arrAux[valPos] = arr[i];
                }


            }
        }
        for (int i = 0; i < arrIndex.length; i++) {
            System.out.println(arrAux[arrIndex[i]]);
        }


    }

}

