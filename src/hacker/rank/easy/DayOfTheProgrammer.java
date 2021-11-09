package hacker.rank.easy;

import java.util.Scanner;

public class DayOfTheProgrammer {
    public static boolean isJulianLeap(int year){
        return year%4==0;
    }
    public static boolean isGregorianLeap(int year){
        if(year%400==0){
            return true;
        }
        if(year%4 == 0){
            if(year%100==0){
                return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year==1918){
            System.out.println("26.09.1918");
        }
        else {
            if(year < 1918){
                if(isJulianLeap(year)){
                    System.out.println("12.09."+year);
                }else {
                    System.out.println("13.09."+year);
                }
            }else {
                if(isGregorianLeap(year)){
                    System.out.println("12.09."+year);
                }else {
                    System.out.println("13.09."+year);
                }
            }
        }
    }
}

