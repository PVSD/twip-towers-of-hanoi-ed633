package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {


        Scanner kbreader = new Scanner (System.in);
        System.out.println("Tower of Hanoi Game");
        System.out.println("Enter Number of Disks");
        int n = kbreader.nextInt();
        tower.TH(n, 1, 3, 2);
    }
}
