package hacker.rank.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tamanio = in.nextInt();
        int array[] = new int[tamanio];
        List<Integer> arreglo = new ArrayList<>();
        List<List<Integer>> arregloAux = new ArrayList<>();
        List<Integer> arre = new ArrayList<>();
        int index = 0;
        int cantidad = 0;
        int countA = 0;
        int count = 0;
        int countB = 0;
        int j = 0;

        for (int i = 0; i < tamanio; i++) {
            array[i] = in.nextInt();
        }
        Arrays.sort(array);

        for (int i = 0; i < tamanio; ) {

            List<Integer> arr = new ArrayList<>();
            countB = 0;
            for (j = i; j < tamanio; j++) {

                if(Math.abs(array[j] - array[i]) <= 1 ) {
                    arr.add(array[j]);
                    countB++;
                } else {
                    i = j;
                    break;
                }

            }

            if(countB > countA) {
                countA = countB;
            }
            if(j == tamanio) {
                //i = j;
                break;
            }

        }

        System.out.println(countA);

    }
}

