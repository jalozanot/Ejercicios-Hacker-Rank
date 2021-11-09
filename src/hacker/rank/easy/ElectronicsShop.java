package hacker.rank.easy;

import java.util.Scanner;

public class ElectronicsShop {

    public static Scanner ent = new Scanner(System.in);

    public static void main(String args[]) {

        int b = ent.nextInt();
        int n = ent.nextInt();
        int m = ent.nextInt();
        int arrayN[] = new int[n];
        int arrayM[] = new int[m];
        int countA = 0;
        int valor = 0;
        int cal = 0;
        boolean flag = false;


        for (int i = 0; i < arrayN.length; i++) {
            arrayN[i] = ent.nextInt();
        }

        for (int i = 0; i < arrayM.length; i++) {
            arrayM[i] = ent.nextInt();
        }

        if(arrayN.length == 1 && arrayM.length == 1) {

            cal = -1;

        } else {

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {

                    valor = arrayN[i] + arrayM[j];

                    if(valor >= cal && valor <= b) {
                        cal = valor;
                    }

                }

            }

        }

        if(cal == 0) {
            cal = -1;
        }

        System.out.println(cal);

    }

}

