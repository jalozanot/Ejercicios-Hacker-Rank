package hacker.rank.easy;

import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tamanio = in.nextInt();
        Long resultSum = 0L;

        for (int i = 1; i <= tamanio; i++) {
            resultSum = resultSum + in.nextLong();
        }


        System.out.println(resultSum);



    }

}
