package hacker.rank.easy;

import java.util.Scanner;

public class SequenceEquation {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int cantidadDatos = in.nextInt();
        int array[] = new int[cantidadDatos];
        int arrayAux[] = new int[cantidadDatos];

        for (int i = 0; i < cantidadDatos; i++) {

            array[i] = in.nextInt();

        }


        for (int i = 0; i < cantidadDatos; i++) {

            for (int j = 0; j < cantidadDatos; j++) {

                if( (i+1) == array[j]) {
                    arrayAux[i] = j+1;
                    //System.out.println(j+1);
                }

            }

        }

        for (int i = 0; i < cantidadDatos; i++) {

            for (int j = 0; j < cantidadDatos; j++) {

                if (  arrayAux[i] == array[j] ) {
                    //arrayAux[i] = j+1;
                    System.out.println(j+1);
                }

            }

        }



    }

}

