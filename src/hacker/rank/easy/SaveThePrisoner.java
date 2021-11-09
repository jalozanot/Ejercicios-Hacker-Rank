package hacker.rank.easy;

import java.io.*;
import java.util.*;

public class SaveThePrisoner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int c = 0; c < cases; c++) {
            int numPrisoners = sc.nextInt();
            int numSweets = sc.nextInt();
            int firstPrisoner = sc.nextInt() - 1;

            int luckyPrisoner = (firstPrisoner + numSweets - 1) % numPrisoners + 1;

            System.out.println(luckyPrisoner);
        }

    }
}

