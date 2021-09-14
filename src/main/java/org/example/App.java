package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Daniel Ragusa
 */

import java.util.Scanner;
import java.util.Calendar;

public class App
{
    public static void main( String[] args )
    {
        String Age;
        System.out.print("What is your current age? ");
        Scanner input=new Scanner(System.in);
        Age=input.next();
        int Num_1=Integer.parseInt(Age);

        String Desired_Age;
        System.out.print("At what age would you like to retire? ");
        Scanner input2=new Scanner(System.in);
        Desired_Age=input2.next();
        int Num_2=Integer.parseInt(Desired_Age);

        int Retire_Age=Num_2-Num_1;
        int Current_Year=Calendar.getInstance().get(Calendar.YEAR);

        System.out.print("You have "+(Retire_Age)+ " years left until you can retire."+"\n"+"It's "+(Current_Year)+" so you can retire in " +(Current_Year+(Num_2-Num_1))+".");

    }
}

