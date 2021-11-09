package hacker.rank.easy;

import java.util.Scanner;

public class SalesByMatch {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int tamanio = in.nextInt();
        int arreglo[] = new int[tamanio];
        int count = 0;
        int countAux = 0;
        int arregloAux[] = new int[tamanio];
        int valor = 0;

        for (int i = 0; i < tamanio; i++) {

            arreglo[i] = in.nextInt();

        }

        for (int i = 0; i < tamanio; i++) {

            valor = arreglo[i];
            countAux = 0 ;
            for (int j = 0; j < tamanio; j++) {

                if( valor == arreglo[j] && valor != 0) {
                    countAux ++;
                    arreglo[j] = 0;
                }

            }

            if(countAux % 2 != 0 && countAux != 1) {
                count = count + ((countAux-1) /2);
            } else if(countAux % 2 == 0 ){
                count = count + (countAux / 2);
            }

        }


        System.out.println(count);

    }

}

