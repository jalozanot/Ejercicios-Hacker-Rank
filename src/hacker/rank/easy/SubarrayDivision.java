package hacker.rank.easy;

import java.util.Scanner;

public class SubarrayDivision {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int tamanio = in.nextInt();
        int arreglo[] = new int[tamanio];
        int count = 0;
        int suma= 0;

        for (int i = 0; i < tamanio; i++) {
            arreglo[i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();


        for(int i = 0; i < tamanio; i++) {
            suma = 0;
            for (int j = 0; j < m; j++) {

                if((i + j) <= (tamanio - 1) ) {
                    suma = suma + arreglo[i+j];
                }


            }

            if( suma == d) {
                count ++;
            }

        }

        System.out.println(count);
    }

}

