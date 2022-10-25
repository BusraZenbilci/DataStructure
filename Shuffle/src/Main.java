/**
 * author: Busra Zenbilci
 * student ID: 20170808054
 *  date: 26.09.2022
 *  Write a method that takes an array containing the set of all integers
 *  in the range 1 to 52 and shuffles it into random order. Y
 *  our method should output each possible order with equal probability.
 *
 */

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int [] array = new int[52];

        for(int i = 0; i<52 ; i++) {
            array[i] = i+1;
        }

        randomArray(array);

        for(int i = 0 ; i < array.length ; i++){

            System.out.print(array[i] + " ");
        }
        System.out.println(" ");

    }

    public static void randomArray (int[] Arr){

        Random random = new Random();

        for(int i = 1; i < Arr.length - 1 ; i++){

            int j = random.nextInt(i);

            int temp = Arr[i];
            Arr[i] = Arr[j];
            Arr[j] = temp;
        }


    }
}
