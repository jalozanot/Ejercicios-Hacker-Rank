package hacker.rank.easy;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        StringBuilder varRever = new StringBuilder();
        long result = 0;
        int diaPerfect = 0;
        String prueba = "";

        while(i <= j) {

            StringBuilder varString = new StringBuilder();
            prueba = Integer.toString(i);
            StringBuilder varS = varString.append(prueba);
            varRever = varS.reverse();
            float valor = Integer.parseInt(varRever.toString());
            double resultado = ((i-valor)/k);


            if( ((resultado % 2) == 0.0) || (resultado % 2) == 1.0  || (resultado % 2) == -0.0 || (resultado % 2) == -1.0) {
                diaPerfect++;

            }

            i++;

        }

        System.out.println(diaPerfect);
    }

}

