package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

    System.out.println("Which times table do you want?");
    int userInput = input.nextInt();
    int i;
    for (i = 1; i < 11; i++){
        System.out.println(i+" * "+userInput+" = "+(i*userInput));
    }
    }
}
