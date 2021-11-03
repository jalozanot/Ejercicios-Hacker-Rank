package hacker.rank.easy;

import java.util.Scanner;

public class StairCase {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int stairLen = in.nextInt();


        for (int i = 1; i <= stairLen; i++) {
            for (int j = 1; j <= stairLen; j++) {

                if(j < stairLen-(i-1)){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }


            }
            System.out.println();
        }


    }
}
