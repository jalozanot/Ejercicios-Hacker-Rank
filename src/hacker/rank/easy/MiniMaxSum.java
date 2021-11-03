package hacker.rank.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tamanio = 5;
        long []arr = new long[tamanio];
        long []arrAux = new long[tamanio];
        long suma = 0;


        for (int i = 0; i < tamanio; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {

                if(j != (i)){
                    suma = suma + arr[j];
                }

            }
            arrAux[i] = suma;
            suma = 0;
        }

        System.out.println(Arrays.stream(arrAux).min().getAsLong() +  " " + Arrays.stream(arrAux).max().getAsLong());

    }


}


