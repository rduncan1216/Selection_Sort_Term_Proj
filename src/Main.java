//Ryan Duncan
//10/16/2020
//CSE 2300 W04
//Term Project
//Selection sort program

//This is a basic program to demonstrate a selection sort using Java.
//Program will ask for input from user and create an array with the input number of random
//integers. The program will print the array before and after sorting. Sorting will be done with a
//selection sorting method.

import java.util.Random;
import java.util.Scanner;


public class Main {

    //selectionSort takes in an array and sorts using selection sort algorithm. Returns the sorted array
    public static int[] selectionSort(int[] sortThis){

        int minimum;

        for(int j = 0; j < sortThis.length; j++){
            minimum = j;
            for(int i = j+1; i < sortThis.length; i++){
                if(sortThis[i] < sortThis[minimum]){
                    minimum = i;
                }
            }
            if(minimum != j){
                int temp = sortThis[j];
                sortThis[j] = sortThis[minimum];
                sortThis[minimum] = temp;
            }
        }

        return sortThis;
    }

    //main method asks for user input for size of array. creates an array of integers and populates with random
    //ints from 0-1000. calls sorting method to sort the array.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("This program will create an array with the number of random integers specified.");
        System.out.println("Please enter an integer:");
        System.out.println();
        int numInts = sc.nextInt();

        int[] randInts = new int[numInts];

        //populate array with random ints
        for(int i = 0; i < randInts.length; i++){
            Random r = new Random();
            int num = r.nextInt(1000);
            randInts[i] = num;
        }

        //print
        System.out.println();
        System.out.println("Here is the array before the selection sort: ");
        System.out.println();
        for(int j = 0; j < randInts.length; j++){
            System.out.print(randInts[j] + " | ");
        }

        //call selectionSort
        randInts = selectionSort(randInts);

        //print
        System.out.println();
        System.out.println();
        System.out.println("Here is the array after the selection sort has been completed:");
        System.out.println();
        for(int j = 0; j < randInts.length; j++){
            System.out.print(randInts[j] + " | ");
        }
    }
}
