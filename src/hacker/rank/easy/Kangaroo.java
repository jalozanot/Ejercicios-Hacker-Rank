package hacker.rank.easy;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String resultado = "";
        int cantSaltosC1 = 0;
        int sumDistC1 = x1;
        int cantSaltosC2 = 0;
        int sumDistC2 = x2;

        for (int i = 0; i < 10000; i++) {

            cantSaltosC1 ++;
            sumDistC1 = sumDistC1 + v1;
            cantSaltosC2 ++;
            sumDistC2 = sumDistC2 + v2;

            if(cantSaltosC1 == cantSaltosC2 && sumDistC1 == sumDistC2) {
                resultado = "YES";
                break;
            }else {
                resultado = "NO";
            }

        }

        System.out.println(resultado);
    }

}

