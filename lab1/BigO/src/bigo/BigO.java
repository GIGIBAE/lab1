/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

import java.util.Arrays;
import java.util.Scanner;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author int320
 */
public class BigO {
    
    private static int N = 1_000_000;
    private static Random r = new Random();
    
    public static void bubbleSort(int[] a) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        long begin = System.currentTimeMillis();
        int[] num = new int[100_000];
        generateArray(num);
        System.out.println("before sort: " + timestamp);
//        bubbleSort(num);
        Arrays.sort(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
//        Arrays.sort();

        System.out.println(" ");
        System.out.println("after sort: " + timestamp);
        System.out.println(
                "Duration: " + (System.currentTimeMillis() - begin) + " milliseconds");
        
    }
    
    public static void generateArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000 + 1);
//            array[i] = (int)(System.currentTimeMillis()%100);
        }
    }
    
}
