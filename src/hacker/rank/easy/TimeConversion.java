package hacker.rank.easy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String [] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String hora = in.nextLine();

        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        Date date = parseFormat.parse(hora);

        System.out.println(displayFormat.format(date));


    }

}
