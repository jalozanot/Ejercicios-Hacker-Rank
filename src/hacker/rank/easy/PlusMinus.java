package hacker.rank.easy;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tamanioArr = in.nextInt();
        int []arreglo = new int[tamanioArr];
        int countNegativeNumber = 0;
        int countPosNumber = 0;
        int countZeroNumber = 0;


        for (int i = 0; i < tamanioArr; i++) {
            arreglo[i] = in.nextInt();
        }

        DecimalFormat format = new DecimalFormat("#.#####");
        countNegativeNumber = (int) Arrays.stream(arreglo).filter(a -> a < 0).count();
        countPosNumber = (int) Arrays.stream(arreglo).filter(a -> a > 0).count();
        countZeroNumber = (int) Arrays.stream(arreglo).filter(a -> a == 0).count();

        float decimalNegativo = (countNegativeNumber / (float)tamanioArr);
        float decimalPositivo = (countPosNumber / (float)tamanioArr);
        float decimalZero = (countZeroNumber / (float)tamanioArr);

        System.out.println(format.format(decimalPositivo));
        System.out.println(format.format(decimalNegativo));
        System.out.println(format.format(decimalZero));




    }

}
