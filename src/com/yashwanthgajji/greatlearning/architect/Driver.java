package com.yashwanthgajji.greatlearning.architect;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of floors in the building");
        //No of days for construction
        int noOfDays = sc.nextInt();
        int[] floors = new int[noOfDays];
        for(int i=0;i<noOfDays;i++) {
            System.out.println("enter the floor size given on day : " + (i+1));
            //Floor given by factory on ith day
            floors[i] = sc.nextInt();
        }
        //Begin construction
        Construction construction = new Construction(noOfDays);
        System.out.println("The order of construction is as follows");
        for(int day =0; day < noOfDays; day++) {
            System.out.println("Day: " + (day+1));
            //Give ith day floor from factory to com.yashwanthgajji.greatlearning.architect
            construction.addFloor(floors[day]);
            //Get numbers of floors that constructed on that day
            ArrayList<Integer> floorsConstructedToday = construction.getConstructedFloorsToday();
            for (int floor: floorsConstructedToday) {
                System.out.print(floor + " ");
            }
            System.out.println();
        }
    }
}
