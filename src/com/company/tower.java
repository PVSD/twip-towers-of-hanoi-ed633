package com.company;

/**
 * Created by ed633 on 1/22/19.
 */
public class tower {

    public static void TH(int disk, int firstPeg, int endPeg, int midPeg)
    {
        if (disk==1)
        {
            System.out.println("Move one disk from tower " + firstPeg + " to " + midPeg);
        }
        else
        {
            TH(disk-1, firstPeg, midPeg, endPeg);
            System.out.println("Move disk " + disk + " from tower " + firstPeg + " to " + midPeg);
            TH(disk-1, endPeg, midPeg, firstPeg);
        }
    }
}
