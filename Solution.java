package com.mycompany.project1;
import java.util.*;
import java.io.*;


public class Solution {

    
    public static void main(String args[]) {
        int cnt = 0;
        Scanner ele = new Scanner(System.in);
        int number = ele.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = ele.nextInt();
        }
        for (int a = 0; a < number; a++) {
            int s=0;
            for (int b = a; b < number; b++) {
                s += array[b];
                if (s < 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}