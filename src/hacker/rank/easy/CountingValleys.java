package hacker.rank.easy;

import java.util.Scanner;

public class CountingValleys {


    public static void main(String args[]) {


        Scanner in = new Scanner(System.in);
        int pasos = in.nextInt();

        char[] array = new char[pasos];
        int colina = 0;
        int val = 0;
        int valle = 0;
        String mountain = in.next();
        array = mountain.toCharArray();

        for (int i = 0; i < pasos; i++) {

            if('U' == array[i]) {
                colina ++;
                if(val == 1 && colina >= 0) {
                    val = 0;
                }
            } else if('D' == array[i]) {
                colina --;
                if(colina < 0 && val == 0) {
                    val = 1;
                    valle ++;
                }
            }

        }

        System.out.println(valle);

    }


}

