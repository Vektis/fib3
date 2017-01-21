package com.company;
import java.util.*;
import java.lang.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        double n = input.nextDouble();
        if(Math.sqrt(5*Math.pow(n,2) + 4) == (int)Math.sqrt(5*Math.pow(n,2) + 4) || Math.sqrt(5*Math.pow(n,2) - 4) == (int)Math.sqrt(5*Math.pow(n,2) - 4)){
            System.out.println("its a fibonnachi number");

        }
        else{
            System.out.println("it isnt a fibonnachi number");
        }

    }
}
