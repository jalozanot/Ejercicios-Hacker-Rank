package hacker.rank.easy;

import java.util.Scanner;

public class DrawingBook {


    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();

        int valP = 0;
        int valI = 0;
        int valPAux = n;
        int valIAux = n;
        int count = 0;
        int pagInicial = 1;
        int pagFinal = n;

        while(true) {

            if( n % 2 == 0) {
                if(p <= (n/2)) {

                    if(p == 1) {
                        count = 0;
                        break;
                    }

                    valP = valP +  (pagInicial + 1);
                    valI = valP +  1;
                    count++;
                    if(valP == p || valI == p) {
                        break;
                    }

                } else if(p > (n/2)) {

                    if(valPAux == p && count == 0) {
                        count = 0;
                        break;
                    }

                    valPAux =  valPAux -  1;
                    valIAux =  valIAux -  2;
                    count++;

                    if(valPAux == p || valIAux == p) {
                        break;
                    }

                }
            } else {

                if(p <= (n/2)) {

                    if(p == 1) {
                        count = 0;
                        break;
                    }

                    valP = valP +  (pagInicial + 1);
                    valI = valP +  1;
                    count++;
                    if(valP == p || valI == p) {
                        break;
                    }

                } else if(p > (n/2)) {

                    if((valPAux == p || (valIAux - 1) == p) && count == 0) {
                        count = 0;
                        break;
                    }

                    valPAux =  valPAux -  2;
                    valIAux =  (valPAux+1) -  2;
                    count++;

                    if(valPAux == p || valIAux == p) {
                        break;
                    }

                }


            }


        }

        System.out.println(count);

    }

}

