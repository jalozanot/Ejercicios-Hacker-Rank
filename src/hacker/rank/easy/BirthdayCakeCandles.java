package hacker.rank.easy;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int tamanio = in.nextInt();
        long []arreglo = new long[10000000];
        for (int i = 0; i <tamanio; i++) {
            ++arreglo[in.nextInt()];
        }

        System.out.println(Arrays.stream(arreglo).max().getAsLong());
        
    }
    
}
