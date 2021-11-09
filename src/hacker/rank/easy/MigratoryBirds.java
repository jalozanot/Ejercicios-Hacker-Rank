package hacker.rank.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MigratoryBirds {

    public static void main(String args[] ) {

        Scanner in = new Scanner(System.in);
        int tamanio = in.nextInt();
        int arreglo[] = new int[tamanio];
        int typo = 0;

        for (int i = 0; i < tamanio; i++) {
            int type = in.nextInt();
            arreglo[type -1 ]++;

        }

        int resultado = Arrays.stream(arreglo).map(a-> a).max().getAsInt();

        for (int i = 0; i < tamanio; i++) {
            if(arreglo[i] == resultado) {
                typo = i;
                break;
            }
        }

        System.out.println(typo+1);


    }

}

