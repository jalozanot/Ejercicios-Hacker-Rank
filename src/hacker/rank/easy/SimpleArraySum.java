package hacker.rank.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArraySum {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> ar = new ArrayList<>();

        int tamanio = in.nextInt();


        for (int i = 0; i < tamanio; i++) {
            ar.add(in.nextInt());
        }

        int result = ar.stream().mapToInt(a -> a).sum();

        System.out.println(result);

    }


}
