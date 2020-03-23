package com.codersbay;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanSortSize = new Scanner(System.in);
        Scanner scanMaxValue = new Scanner(System.in);
        Random randomNumber = new Random();

        System.out.println("How many numbers do you want to sort? (integer!)");
        int howMany = scanSortSize.nextInt();

        System.out.println("Enter the max number of the sort! (integer!");
        int howLarge = scanMaxValue.nextInt();
        int[] preSort = new int[howMany];

        for (int i = 0; i < howMany; i++) {
            preSort[i] = randomNumber.nextInt(howLarge);
        }

        System.out.println();
        System.out.println("These are your randomly generated numbers:");
        System.out.println(Arrays.toString(preSort));
        //System.out.println("array length = "+ preSort.length);
        System.out.println();

        numbersSort(preSort);
    }

    public static void numbersSort(int[] finalSort) {
        int saveValue;

        for (int k = 0; k < finalSort.length - 1; k++) {
            for (int m = 0; m < (finalSort.length - 1 - k); m++) {
                if (finalSort[m] > finalSort[m + 1]) {
                    saveValue = finalSort[m];
                    finalSort[m] = finalSort[m + 1];
                    finalSort[m + 1] = saveValue;
                }
            }
            //System.out.print("step #" + (k+1) + " ==> ");
            //System.out.println(Arrays.toString(numbers));
        }
        System.out.println("sorting magic happening");
        System.out.println();
        System.out.println("final result");
        System.out.println(Arrays.toString(finalSort));


    }
}
