package hacker.rank.easy;

import java.util.Scanner;

public class BillDivision {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int tamanio = in.nextInt();
        int declineValor = in.nextInt();
        int array[] = new int[tamanio];
        int totalFac = 0;
        int valorPagar = 0;

        for (int i = 0; i < tamanio; i++) {
            array[i] = in.nextInt();
        }

        int bCharged = in.nextInt();

        for (int i = 0; i < tamanio; i++) {

            if(i != declineValor) {
                totalFac = totalFac + array[i];
            }

        }
        valorPagar = totalFac /2;

        if(bCharged - valorPagar <= 0) {
            System.out.println("Bon Appetit");
        } else if(bCharged - valorPagar > 0) {
            System.out.println(bCharged - valorPagar);
        }


    }

}
