package hacker.rank.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppleAndOrange {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int tamM = in.nextInt();
        int tamN = in.nextInt();

        List<Long> arregloA= new ArrayList<>();
        List<Long> arregloB= new ArrayList<>();

        for (int i = 0; i < tamM; i++) {
            arregloA.add(Long.parseLong(in.next()));
        }

        for (int i = 0; i < tamN; i++) {
            arregloB.add(Long.parseLong(in.next()));
        }


        List<Long> sumaA  = arregloA.stream().map(z -> (a + z)).collect(Collectors.toCollection(ArrayList::new));
        List<Long> sumaB  = arregloB.stream().map(z -> (b + z)).collect(Collectors.toCollection(ArrayList::new));

        List<Long> resultB = sumaB.stream().filter(z -> (z >= s && z <= t)).collect(Collectors.toList());
        System.out.println(sumaA.stream().filter(z -> (z >= s && z <= t)).collect(Collectors.toList()).size());
        System.out.println(resultB.size());
    }

}