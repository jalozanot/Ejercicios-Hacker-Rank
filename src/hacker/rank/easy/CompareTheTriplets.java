package hacker.rank.easy;


import java.util.Scanner;
import java.util.function.BiPredicate;


public class CompareTheTriplets {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int []arregloA = new int[3];
        int []arregloB = new int[3];
        int countAlice = 0;
        int countBob = 0;


        for (int i = 0; i < 3; i++) {
            arregloA[i] = in.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            arregloB[i] = in.nextInt();
        }

        BiPredicate<Integer, Integer> alice = (a,b) -> a > b;
        BiPredicate<Integer, Integer> bob = (a,b) -> a < b;

        for (int i = 0; i < 3; i++) {

            if (alice.test(arregloA[i],arregloB[i])){
                countAlice++;
            }

            if (bob.test(arregloA[i],arregloB[i])) {
                countBob++;
            }


        }

        System.out.println(countAlice + " " + countBob);


    }

}
