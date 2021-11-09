package hacker.rank.easy;

import java.util.Scanner;

public class Grading {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int cantNotes = in.nextInt();
       // int []arr = new int[];


        for (int i = 0; i < cantNotes; i++) {

            //arr[i] = validarNotes(in.nextInt());
            System.out.println(validarNotes(in.nextInt()));

        }


    }


    public static int validarNotes(int note) {

        int calNote = 5 - (note % 5);

        if(note < 38) {
            return note;
        }

        if(calNote < 3){
            return note+calNote;
        }else{
            return note;
        }

    }

}
