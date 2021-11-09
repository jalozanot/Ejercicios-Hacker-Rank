package hacker.rank.easy;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int E = 100;
        int valorK = 0;
        int index = 0;

        int arreglo[] = new int[n];

        for (int i = 0; i < n; i++) {
            arreglo[i] = in.nextInt();
        }


        for (int i = 0; i < n; i++) {

            valorK = valorK + k;

            index = (valorK)%n;
            if(index != 0) {
                if(arreglo[index] == 1) {
                    E = E - (1 + 2);
                }else {
                    E = E - 1;
                }
            }else {
                if(arreglo[index] == 1) {
                    E = E - (1 + 2);
                    break;
                }else {
                    E = E - 1;
                    break;
                }
            }


        }
        System.out.println(E);

    }

}

