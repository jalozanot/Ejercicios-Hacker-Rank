package hacker.rank.easy;

import java.util.Scanner;

public class ViralAdvertising {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int d = in.nextInt();
        long shared = 5;
        long liked = 0;
        long cumulative = 0;
        long resulShared = 0;

        for (int i = 1; i <= d; i++) {

            resulShared = shared / 2;
            if(resulShared == 1) {
                resulShared = 2;
            }
            liked = resulShared;
            cumulative = cumulative + resulShared;
            shared = resulShared * 3;

        }

        System.out.println(cumulative);

    }

}

