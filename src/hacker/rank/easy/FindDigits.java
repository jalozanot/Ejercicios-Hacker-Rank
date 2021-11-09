package hacker.rank.easy;

import java.util.Scanner;

public class FindDigits {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        int count = 0;



        for (int i = 1; i <= t; i++) {
            int n = in.nextInt();
            String numToString = Integer.toString(n);
            char[] numero = numToString.toCharArray();
            for (int j = 0; j < numero.length; j++) {
                int val = Integer.parseInt(String.valueOf(numero[j]));
                int modResult =  (val != 0)?  n % val: 1;
                if( modResult == 0) {
                    count ++;
                }

            }

            System.out.println(count);
            count = 0;

        }

    }

}

