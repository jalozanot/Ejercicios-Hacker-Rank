package hacker.rank.easy;

import java.util.Scanner;

public class BreakingBestAndWorstRecords {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arreglo[] = new int[n];
        int valorMax = -1;
        int valorMin = 999999999;
        int countValorMax = 0;
        int countValorMin = 0;
        for (int i = 0; i < n; i++) {

            arreglo[i] = in.nextInt();

        }

        for (int i = 0; i < n; i++) {

            if(arreglo[i] > valorMax) {
                valorMax = arreglo[i];
                countValorMax ++;
            }

            if(arreglo[i] < valorMin) {
                valorMin = arreglo[i];
                countValorMin ++;
            }

        }


        System.out.println((countValorMax-1) + " " + (countValorMin-1));

    }

}