package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    //System.out.println("Which times table do you want?");
    //int userInput = input.nextInt();
    //int i;
    //for (i = 1; i < 11; i++){
        // System.out.println(i+" * "+userInput+" = "+(i*userInput));
    //}
        System.out.println("Enter a number");
        int userInput = input.nextInt();
        int j1 = 0;
        int end = userInput;
        for (int i = 0; i<userInput;i++){
            for(int j = j1; j < end; j++){
                System.out.print(j);
            }
            System.out.println();
            j1++;
            end++;
        }
    }
}
