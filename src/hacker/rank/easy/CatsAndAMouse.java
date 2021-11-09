package hacker.rank.easy;

import java.util.Scanner;
import java.lang.Math;

public class CatsAndAMouse {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int cantidad = in.nextInt();
        int arreglo[][] = new int[cantidad][3];

        for (int i = 0; i < cantidad; i++) {

            for (int j = 0; j < 3; j++) {

                arreglo[i][j] = in.nextInt();

            }

        }

        for (int i = 0; i < cantidad; i++) {



            if( Math.abs(arreglo[i][2] - arreglo[i][0]) > Math.abs(arreglo[i][2] - arreglo[i][1]) ) {
                System.out.println("Cat B");
            } else if( Math.abs(arreglo[i][2] - arreglo[i][0]) < Math.abs(arreglo[i][2] - arreglo[i][1]) ) {
                System.out.println("Cat A");
            } if( Math.abs(arreglo[i][2] - arreglo[i][0]) == Math.abs(arreglo[i][2] - arreglo[i][1]) ) {
                System.out.println("Mouse C");
            }



        }

    }

}

