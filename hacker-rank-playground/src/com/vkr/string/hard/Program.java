package com.vkr.string.hard;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Program {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] genes = new String[n];

        String[] genesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int highSize = Integer.MIN_VALUE;
        int lowSize = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String genesItem = genesItems[i];
            genes[i] = genesItem;

            if(genesItem.length() > highSize){
            	highSize = genesItem.length();
            }
            
            if(genesItem.length() < lowSize) {
            	lowSize = genesItem.length();
            }
        }

        int[] health = new int[n];

        String[] healthItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int healthItem = Integer.parseInt(healthItems[i]);
            health[i] = healthItem;
        }

        int s = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long solution = Long.MIN_VALUE;
        long minSolution = Long.MAX_VALUE;
        for (int sItr = 0; sItr < s; sItr++) {
            String[] firstLastd = scanner.nextLine().split(" ");
            int first = Integer.parseInt(firstLastd[0]);
            int last = Integer.parseInt(firstLastd[1]);
            String d = firstLastd[2];

            int hs = highSize;
            int ls = lowSize;
            int sum = 0;
               while(hs >= ls){
                   for(int j =0 ; j < d.length(); j++){
                       if(j+hs > d.length()){
                           break;
                       }
                    for(int i = first; i <= last; i++){
                       if(genes[i].equals(d.substring(j, j+hs))){
                           sum += health[i];
                       }
                    }
                   }
                   hs--;
               }
                if(solution < sum ){
                    solution = sum;
                }
                if(minSolution > sum){
                    minSolution = sum;
                } 
            }
        System.out.println(minSolution + " " + solution);
        scanner.close();
    }
}
