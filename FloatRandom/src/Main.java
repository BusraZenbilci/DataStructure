/**
 * name: Busra Zenbilci
 * student ID: 20170808054
 * date: 27.09.2022
 *
 * Write a method that takes an array of float values and determines
 * if all the numbers are different from each other
 * (that is, they are distinct) up to 4 digits after point.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        compare(10);
    }

    public static int compare ( int n) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entry n value: ");
        n= scan.nextInt();

        float [] a = new float[n];

        for( int i = 0 ; i < n ; i++) {
            a[i] = (float) Math.random();

            System.out.println(a[i]);


            int j = 1;
            while ( j <= 4) {
                System.out.print(  a[i] * 10  );

                j++;


            }
        }

    }



}
